package com.bruyako;

import com.bruyako.model.ContactDto;
import com.bruyako.model.PhotoDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface PhotoDao{

    Set<PhotoDto> getAllPhotosFotContact(ContactDto contactDto);

    void save(PhotoDto photoDto);

    void delete(PhotoDto photoDto);
}
