package com.bruyako.service;

import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;

import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
public interface HobbyService {

    public void addHobby(Hobby hobby);
    public void editHobby(Hobby hobby);
    public Set<Contact> getAllContactsWithHobby(Hobby hobby);
}
