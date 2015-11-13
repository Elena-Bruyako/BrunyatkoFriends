package com.bruyako;

import com.bruyako.model.PhotoDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface PhotoDao{

    Set<PhotoDto> getAllPhotosFotContact(Long contactId);

    Long save(PhotoDto photoDto);

    void delete(PhotoDto photoDto);
}
