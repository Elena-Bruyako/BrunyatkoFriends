package com.bruyako;

import com.bruyako.model.PlaceDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface PlaceService {

    void addPlace(PlaceDto placeDto);

    void deletePlace(PlaceDto placeDto);

    Set<PlaceDto> getAllPlaceForContact(Long contactId);

    PlaceDto getById(Long placeId);
}
