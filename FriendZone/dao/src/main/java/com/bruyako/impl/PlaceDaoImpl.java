package com.bruyako.impl;

import com.bruyako.dao.PlaceDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Place;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PlaceDaoImpl implements PlaceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<Contact> getAllContactsForPlace(Place place) {
        return place.getPlacesOfContact();
    }

    @Override
    public void create(Place place) {

        sessionFactory.getCurrentSession().save(place);
    }

    @Override
    public void delete(Place place) {

        sessionFactory.getCurrentSession().delete(place);
    }

    @Override
    public List<Place> getAll() {

        return sessionFactory.getCurrentSession().createQuery("FROM Place").list();
    }

    @Override
    public Place getById(Long id) {

        Place place = sessionFactory.getCurrentSession().get(Place.class, id);
        return place;
    }
}
