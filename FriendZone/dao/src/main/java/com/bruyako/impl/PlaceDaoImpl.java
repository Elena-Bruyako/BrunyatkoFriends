package com.bruyako.impl;

import com.bruyako.dao.PlaceDao;
import com.bruyako.model.Place;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PlaceDaoImpl implements PlaceDao {

    private Map<String, Place> placesMap = new HashMap<>();
    private Place place;

    @PostConstruct
    public void init(){

        place.setTitle("Country");
        place.setDescription("See Georgia");
        place.setLatitude(45.1254656);
        place.setLongitude(56.2135465);

        placesMap.put(place.getTitle(), place);
    }


    @Override
    public List<Place> getAllContactsForPlace(Place place) {
        return null;
    }

    @Override
    public void create(Place place) {
        placesMap.put(place.getTitle(), place);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Place place) {

    }

    @Override
    public List<Place> getAll() {
        return null;
    }

}
