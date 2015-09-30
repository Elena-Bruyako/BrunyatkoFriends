package com.bruyako.dao;

import com.bruyako.model.Place;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public interface PlaceDao extends AbstractDao<Place, String> {


    Collection<Place> getAllContactsForPlace();
}

