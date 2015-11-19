package com.bruyako.impl;

import com.bruyako.PlaceDaoInterface;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.PlaceDao;
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
public class PlaceDaoImpl implements PlaceDaoInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<PlaceDto> getAllPlaceForContact(Long contactId) {


        List<PlaceDao> places = sessionFactory.getCurrentSession().createSQLQuery("select p.title, p.description from Place p join Contact_Place cp" +
                " on p.place_id = cp.place_id join Contact c on cp.contact_id = c.contact_id " +
                "where c.contact_id = :contactId").setResultTransformer(Transformers.aliasToBean(PlaceDao.class)).setParameter("contactId", contactId).list();

        Set<PlaceDto> result = new HashSet<>(places.size());

        for (PlaceDao place : places) {

            result.add(EntityDtoConverter.convert(place));

        }
        return result;
    }

    @Transactional(readOnly = false)
    @Override
    public void add(PlaceDto placeDto) {

        PlaceDao place = EntityDtoConverter.convert(placeDto);
        sessionFactory.getCurrentSession().save(place);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(PlaceDto placeDto) {

        PlaceDao place = EntityDtoConverter.convert(placeDto);
        sessionFactory.getCurrentSession().delete(place);
    }

    @Override
    public PlaceDto getById(Long placeId) {

        List<PlaceDao> places = sessionFactory.getCurrentSession().createQuery("select p from Place p where p.id = :id").setParameter("id", placeId).list();
        if (places.isEmpty()) {
            return null;
        } else {
            return EntityDtoConverter.convert(places.get(0));
        }
    }
}
