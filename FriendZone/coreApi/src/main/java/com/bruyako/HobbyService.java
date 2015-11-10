package com.bruyako;

import com.bruyako.model.ContactDto;
import com.bruyako.model.HobbyDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface HobbyService {

    HobbyDto addHobby(String title, String description);

    void setHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto);

    Set<HobbyDto> getAllHobbyForContact(ContactDto contactDto);
}
