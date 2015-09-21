package com.bruyako.daoService;

import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface HobbyDaoService {

    public void addHobby(String title, String description);
    public Set<Contact> getAllContactsWithHobby(Hobby hobby);
}
