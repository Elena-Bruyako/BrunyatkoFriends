package com.bruyako;

import com.bruyako.model.PhotoDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface PhotoService {

    Set<PhotoDto> getAllPhotosFotContact(Long contactId);

    PhotoDto getById(Long photoId);

    void addPhoto(PhotoDto photoDto);

//    void deletePhoto(PhotoDto photoDto);
}
