package com.bruyako.impl;

import com.bruyako.dao.HobbyDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class HobbyDaoImpl implements HobbyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<Contact> getAllContactsWithHobby(Hobby hobby) {

        return hobby.getHobbiesOfContact();
    }

    @Override
    public void create(Hobby hobby) {

        sessionFactory.getCurrentSession().save(hobby);
    }

    @Override
    public void delete(Hobby hobby) {

        sessionFactory.getCurrentSession().delete(hobby);
    }

    @Override
    public List<Hobby> getAll() {

        return sessionFactory.getCurrentSession().createQuery("FROM Hobby").list();
    }

    @Override
    public Hobby getById(Long id) {

        Hobby hobby = sessionFactory.getCurrentSession().get(Hobby.class, id);
        return hobby;
    }
}
