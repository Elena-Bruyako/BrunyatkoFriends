package com.bruyako.dao;

import com.bruyako.model.Hobby;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface HobbyDao extends AbstractDao<Hobby> {

    List<Hobby> getAllContactsWithHobby(Hobby hobby);
}
