package com.bruyako.dao;

import com.bruyako.model.Hobby;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public interface HobbyDao extends AbstractDao<Hobby, String> {

    Collection<Hobby> getAllContactsWithHobby(Hobby hobby);
}
