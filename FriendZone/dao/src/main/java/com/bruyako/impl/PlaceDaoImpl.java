package com.bruyako.impl;

import com.bruyako.dao.PlaceDao;
import com.bruyako.model.Place;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public class PlaceDaoImpl implements PlaceDao {

    private Map<String, Place> placeMaps = new HashMap<>();

    @Override
    public void add(Place place) {
        placeMaps.put(place.getTitle(), place);
    }

    @Override
    public void edit(Place place) {

    }

    @Override
    public Place get(String s) {
        return null;
    }

    @Override
    public Collection<Place> getAllContactsForPlace() {
        return placeMaps.values();
    }

    @Override
    public void remove(Place place) {
        placeMaps.remove(place);
    }

    @Override
    public Place update(Place place) {
        return null;
    }
}
