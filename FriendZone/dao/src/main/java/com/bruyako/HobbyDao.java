package com.bruyako;

import com.bruyako.model.ContactDto;
import com.bruyako.model.HobbyDto;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface HobbyDao extends AbstractDao<HobbyDto, Long> {

   Set<HobbyDto> getAllHobbyForContact(ContactDto contactDto);

}
