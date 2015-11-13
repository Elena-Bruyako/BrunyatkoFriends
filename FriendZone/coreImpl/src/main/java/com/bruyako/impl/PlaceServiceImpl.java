package com.bruyako.impl;

import com.bruyako.ContactDao;
import com.bruyako.PlaceDao;
import com.bruyako.PlaceService;
import com.bruyako.model.ContactDto;
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
    private ContactDao contactDao;

    @Autowired
    private PlaceDao placeDao;

    @Override
    public PlaceDto addPlace(String title, String description) {

        PlaceDto place = new PlaceDto(title, description);
        placeDao.create(place);

        return place;
    }

    @Override
    public void setPlaceToContact(ContactDto contactDto, PlaceDto placeDto) {

        contactDao.addPlaceToContact(contactDto, placeDto);
    }

    @Override
    public Set<PlaceDto> getAllPlaceForContact(Long contactId) {
        return placeDao.getAllPlaceForContact(contactId);
    }
}
