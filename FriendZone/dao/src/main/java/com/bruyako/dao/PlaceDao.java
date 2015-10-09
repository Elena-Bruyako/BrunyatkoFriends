package com.bruyako.dao;

import com.bruyako.model.Place;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface PlaceDao extends AbstractDao<Place> {


    List<Place> getAllContactsForPlace(Place place);
}

