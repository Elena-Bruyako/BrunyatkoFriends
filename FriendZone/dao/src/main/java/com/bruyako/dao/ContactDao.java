package com.bruyako.dao;

import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import com.bruyako.model.Place;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface ContactDao extends AbstractDao<Contact, Long> {

    void addFriendship(Contact firstContact, Contact secondContact);

    void deleteFriendship(Contact firstContact, Contact secondContact);

    void saveContact(Contact contact);

    void addHobbyToContact(Contact contact, Hobby hobby);
    void addPlaceToContact(Contact contact, Place place);

}


