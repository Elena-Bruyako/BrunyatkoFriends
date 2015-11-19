package com.bruyako;

import com.bruyako.model.PlaceDto;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface PlaceDaoInterface extends AbstractDao<PlaceDto, Long> {

    Set<PlaceDto> getAllPlaceForContact(Long contactId);
}

