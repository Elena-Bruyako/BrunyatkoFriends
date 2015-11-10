package com.bruyako;

import com.bruyako.model.ContactDto;
import com.bruyako.model.PlaceDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface PlaceService {

    PlaceDto addPlace(String title, String description);

    void setPlaceToContact(ContactDto contactDto, PlaceDto placeDto);

    Set<PlaceDto> getAllPlaceForContact(ContactDto contactDto);
}
