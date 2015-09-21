package com.bruyako.daoService;

import com.bruyako.model.Contact;
import com.bruyako.model.Place;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface PlaceDaoService {

    public void addPlace(String title, double longitude, double latitude, String description);
    public Set<Contact> getAllContactsForPlace(Place place);
}

