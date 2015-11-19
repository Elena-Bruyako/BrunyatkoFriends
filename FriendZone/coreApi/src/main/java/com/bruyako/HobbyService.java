package com.bruyako;

import com.bruyako.model.ContactDto;
import com.bruyako.model.HobbyDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface HobbyService {

    void addHobby(HobbyDto hobbyDto);

    void deleteHobby(HobbyDto hobbyDto);

    Set<HobbyDto> getAllHobbyForContact(Long contactId);

    HobbyDto getById(Long hobbyId);
}
