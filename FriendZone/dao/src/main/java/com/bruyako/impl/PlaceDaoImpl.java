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

//    private static long id = 1;
//    private Map<Long, Place> placesMap = new HashMap<>();


    @Override
    public Set<Contact> getAllContactsForPlace(Place place) {
        return place.getPlacesOfContact();
    }

    @Override
    public void create(Place place) {

        sessionFactory.getCurrentSession().save(place);
//        place.setId(id++);
//        placesMap.put(place.getId(), place);
    }

    @Override
    public void delete(Place place) {

        sessionFactory.getCurrentSession().delete(place);

//        Long tmp = null;
//
//        for (Map.Entry entry : placesMap.entrySet()) {
//            if (entry.getValue().equals(place)) {
//                tmp = (Long) entry.getKey();
//                break;
//            }
//        }
//        placesMap.remove(tmp);
    }

    @Override
    public List<Place> getAll() {

        return sessionFactory.getCurrentSession().createQuery("FROM Place").list();

//        List<Place> allPlaces = new ArrayList<>();
//
//        for (Map.Entry entry : placesMap.entrySet()) {
//            allPlaces.add((Place) entry.getValue());
//        }
//
//        return allPlaces;
    }

    @Override
    public Place getById(Long id) {

        Place place = sessionFactory.getCurrentSession().get(Place.class, id);
        return place;

//        Place placeById = null;
//
//        for (Map.Entry entry : placesMap.entrySet()) {
//            if (entry.getKey().equals(id)) {
//                placeById = (Place) entry.getValue();
//            }
//        }
//
//        return placeById;
    }

}
