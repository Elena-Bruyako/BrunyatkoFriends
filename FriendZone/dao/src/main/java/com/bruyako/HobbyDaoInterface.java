package com.bruyako;

import com.bruyako.model.HobbyDto;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface HobbyDaoInterface extends AbstractDao<HobbyDto, Long> {

   Set<HobbyDto> getAllHobbyForContact(Long contactId);

}
