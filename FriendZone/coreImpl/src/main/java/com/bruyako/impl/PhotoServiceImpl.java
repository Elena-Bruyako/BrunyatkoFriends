package com.bruyako.impl;

import com.bruyako.PhotoDao;
import com.bruyako.PhotoService;
import com.bruyako.model.ContactDto;
import com.bruyako.model.PhotoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoDao photoDao;

    @Override
    public Set<PhotoDto> getAllPhotosFotContact(Long contactId) {
        return photoDao.getAllPhotosFotContact(contactId);
    }

    @Override
    public void savePhoto(PhotoDto photoDto) {
        photoDao.save(photoDto);
    }

    @Override
    public void deletePhoto(PhotoDto photoDto) {
        photoDao.delete(photoDto);
    }
}