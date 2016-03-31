package com.bruyako.impl;

import com.bruyako.PlaceDao;
import com.bruyako.PlaceService;
import com.bruyako.model.PlaceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceDao placeDao;

    @Override
    public void addPlace(PlaceDto placeDto) {

        placeDao.add(placeDto);
    }

    @Override
    public void deletePlace(Long placeId) {
        placeDao.delete(placeId);
    }

    @Override
    public Set<PlaceDto> getAllPlaceForContact(Long contactId) {
        return placeDao.getAllPlaceForContact(contactId);
    }

    @Override
    public Set<PlaceDto> getAllPlaces() {
        return placeDao.getAllPlaces();
    }

    @Override
    public PlaceDto getById(Long placeId) {
        return placeDao.getById(placeId);
    }
}
