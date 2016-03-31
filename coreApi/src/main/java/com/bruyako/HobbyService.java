package com.bruyako;

import com.bruyako.model.HobbyDto;

import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface HobbyService {

    void addHobby(HobbyDto hobbyDto);

    void deleteHobby(Long hobbyId);

    Set<HobbyDto> getAllHobbyForContact(Long contactId);

    List<HobbyDto> getAllHobbies();

    HobbyDto getById(Long hobbyId);
}
