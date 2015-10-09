package com.bruyako.dao;

import com.bruyako.model.Contact;
/**
 * Created by brunyatko on 21.09.15.
 */
public interface ContactDao extends AbstractDao<Contact> {

    void addFriendship(Contact firstContact, Contact secondContact);

    void deleteFriendship(Contact firstContact, Contact secondContact);

}


