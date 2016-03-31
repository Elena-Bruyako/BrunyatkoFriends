package com.bruyako.impl;

import com.bruyako.HobbyDao;
import com.bruyako.entity.Contact;
import com.bruyako.entity.Hobby;
import com.bruyako.model.HobbyDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import com.bruyako.converters.EntityDtoConverter;

/**
 * Created by brunyatko on 21.09.15.
 */
@Transactional
@Repository
public class HobbyDaoImpl implements HobbyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<HobbyDto> getAllHobbyForContact(Long contactId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Set<Hobby> hobbies = contact.getHobbies();
        Set<HobbyDto> result = new HashSet<>(hobbies.size());

        for (Hobby hobby : hobbies) {

            result.add(EntityDtoConverter.convert(hobby));
        }
        return result;
    }

    @Override
    public List<HobbyDto> getAllHobby() {

        List<Hobby> hobbies = sessionFactory.getCurrentSession().createQuery("from Hobby h").list();

        List<HobbyDto> result = new ArrayList<HobbyDto>(hobbies.size());

        for (Hobby hobby : hobbies) {
            result.add(EntityDtoConverter.convert(hobby));
        }
        return result;
    }

    @Transactional(readOnly = false)
    @Override
    public void add(HobbyDto hobbyDto) {

        Hobby hobby = EntityDtoConverter.convert(hobbyDto);
        sessionFactory.getCurrentSession().save(hobby);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(Long hobbyId) {

        Hobby hobby = new Hobby();
        hobby.setHobbyId(hobbyId);
        sessionFactory.getCurrentSession().delete(hobby);
    }

    @Override
    public HobbyDto getById(Long hobbyId) {

        Hobby hobby = (Hobby) sessionFactory.getCurrentSession().get(Hobby.class, hobbyId);
        return EntityDtoConverter.convert(hobby);
    }
}
