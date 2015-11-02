package com.bruyako.impl;

import com.bruyako.HobbyDao;
import com.bruyako.entity.Contact;
import com.bruyako.entity.Hobby;
import com.bruyako.model.ContactDto;
import com.bruyako.model.HobbyDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import static com.bruyako.converters.EntityDtoConverter.convert;

/**
 * Created by brunyatko on 21.09.15.
 */
@Transactional
@Repository
public class HobbyDaoImpl implements HobbyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<HobbyDto> getAllHobbyForContact(Long contactDtoId) {


        return null;

    }

    @Override
    public Long create(HobbyDto hobbyDto) {

        Hobby hobby = convert(hobbyDto);
        sessionFactory.getCurrentSession().save(hobby);
        return hobby.getId();
    }

    @Override
    public void delete(HobbyDto hobbyDto) {

        Hobby hobby = convert(hobbyDto);
        sessionFactory.getCurrentSession().delete(hobby);

    }

    @Override
    public HobbyDto getById(Long id) {

        List<Hobby> hobbies = sessionFactory.getCurrentSession().createQuery("select h from Hobby h where h.id = :id").setParameter("id", id).list();
        if (hobbies.isEmpty()) {
            return null;
        } else {
            return convert(hobbies.get(0));
        }
    }

}
