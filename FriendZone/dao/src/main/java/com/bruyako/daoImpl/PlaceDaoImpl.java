package com.bruyako.daoImpl;

import com.bruyako.daoService.PlaceDaoService;
import com.bruyako.model.Contact;
import com.bruyako.model.Place;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public class PlaceDaoImpl implements PlaceDaoService {
    @Override
    public void addPlace(String title, double longitude, double latitude, String description) {

    }

    @Override
    public Set<Contact> getAllContactsForPlace(Place place) {
        return null;
    }
}
