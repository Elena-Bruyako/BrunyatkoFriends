package com.bruyako.dao;

import com.bruyako.model.Contact;
import com.bruyako.model.Place;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface PlaceDao extends AbstractDao<Place, Long> {

    Set<Contact> getAllContactsForPlace(Place place);
}

