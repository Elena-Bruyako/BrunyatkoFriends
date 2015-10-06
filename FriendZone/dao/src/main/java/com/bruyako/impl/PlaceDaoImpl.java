package com.bruyako.impl;

import com.bruyako.dao.PlaceDao;
import com.bruyako.model.Place;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public class PlaceDaoImpl implements PlaceDao {

    private Map<String, Place> placesMap = new HashMap<>();

    Place place = new Place();

    @PostConstruct
    public void init(){

        place.setTitle("Country");
        place.setDescription("See Georgia");
        place.setLatitude(45.1254656);
        place.setLongitude(56.2135465);

        placesMap.put(place.getTitle(), place);
    }


    @Override
    public Collection<Place> getAllContactsForPlace(Place place) {
        return null;
    }

    @Override
    public void create(Place place) {
        placesMap.put(place.getTitle(), place);
    }

    @Override
    public void delete(Place place) {
        placesMap.remove(place);
    }

    @Override
    public Place update(String s) {
        return null;
    }

    @Override
    public Place get(String s) {
        return placesMap.get(s);
    }
}
