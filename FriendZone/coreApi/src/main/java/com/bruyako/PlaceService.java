package com.bruyako;

import com.bruyako.model.PlaceDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface PlaceService {

    void addPlace(PlaceDto placeDto);

    void deletePlace(Long placeId);

    Set<PlaceDto> getAllPlaceForContact(Long contactId);

    Set<PlaceDto> getAllPlaces();

    PlaceDto getById(Long placeId);
}
