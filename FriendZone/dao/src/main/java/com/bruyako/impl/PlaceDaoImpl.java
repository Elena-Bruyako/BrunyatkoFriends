package com.bruyako.impl;

import com.bruyako.PlaceDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.Contact;
import com.bruyako.entity.Place;
import com.bruyako.model.PlaceDto;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Transactional
@Repository
public class PlaceDaoImpl implements PlaceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<PlaceDto> getAllPlaceForContact(Long contactId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);

        Set<Place> places = contact.getPlaces();
        Set<PlaceDto> result = new HashSet<>(places.size());

        for (Place place : places) {

            result.add(EntityDtoConverter.convert(place));

        }
        return result;
    }

    @Override
    public Set<PlaceDto> getAllPlaces() {

        List<Place> places = sessionFactory.getCurrentSession().createQuery("from Place p").list();
        Set<PlaceDto> result = new HashSet<>(places.size());
        for (Place place : places) {

            result.add(EntityDtoConverter.convert(place));

        }
        return result;
    }

    @Transactional(readOnly = false)
    @Override
    public void add(PlaceDto placeDto) {

        Place place = EntityDtoConverter.convert(placeDto);
        sessionFactory.getCurrentSession().save(place);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(Long placeId) {

        Place place = new Place();
        place.setPlaceId(placeId);
        sessionFactory.getCurrentSession().delete(place);
    }

    @Override
    public PlaceDto getById(Long placeId) {

        Place place = (Place) sessionFactory.getCurrentSession().get(Place.class, placeId);
        return EntityDtoConverter.convert(place);
    }
}
