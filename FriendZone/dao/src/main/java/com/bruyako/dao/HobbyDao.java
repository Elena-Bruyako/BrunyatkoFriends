package com.bruyako.dao;

import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;

import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface HobbyDao extends AbstractDao<Hobby, Long> {

    List<Contact> getAllContactsWithHobby(Hobby hobby);

}
