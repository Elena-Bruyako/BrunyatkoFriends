package com.bruyako.impl;

import com.bruyako.PlaceDao;
import com.bruyako.entity.Place;
import com.bruyako.model.ContactDto;
import com.bruyako.model.PlaceDto;
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
public class PlaceDaoImpl implements PlaceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<PlaceDto> getAllPlaceForContact(ContactDto contactDto) {
        return null;
    }

    @Transactional(readOnly = false)
    @Override
    public Long create(PlaceDto placeDto) {

        Place place = convert(placeDto);
        sessionFactory.getCurrentSession().save(place);
        return place.getId();
    }

    @Override
    public void delete(PlaceDto placeDto) {

        Place place = convert(placeDto);
        sessionFactory.getCurrentSession().delete(place);
    }

    @Override
    public PlaceDto getById(Long id) {

        List<Place> places = sessionFactory.getCurrentSession().createQuery("select p from Place p where p.id = :id").setParameter("id", id).list();
        if (places.isEmpty()) {
            return null;
        } else {
            return convert(places.get(0));
        }
    }
}
