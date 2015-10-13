package com.bruyako.impl;

import com.bruyako.dao.PlaceDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Place;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PlaceDaoImpl implements PlaceDao {

    private Map<String, Place> placesMap = new HashMap<>();

    @PostConstruct
    public void init(){

        Place place = new Place();

        place.setTitle("Country");
        place.setDescription("See Georgia");
        place.setLatitude(45.1254656);
        place.setLongitude(56.2135465);

        placesMap.put(place.getTitle(), place);
    }


    @Override
    public Set<Contact> getAllContactsForPlace(Place place) {
        return null;
    }

    @Override
    public void create(Place place) {
        placesMap.put(place.getTitle(), place);
    }

    @Override
    public void delete(Place place) {

    }

    @Override
    public void update(Place place) {

    }

    @Override
    public List<Place> getAll() {
        return null;
    }

    @Override
    public Place getById(Long aLong) {
        return null;
    }

}
