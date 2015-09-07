package com.bruyako.service;

import com.bruyako.model.Contact;
import com.bruyako.model.Place;

import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
public interface PlaceService {

    public void addPlace(Place place);
    public void editPlace(Place place);
    public Set<Contact> getAllContactsForPlace(Place place);
}
