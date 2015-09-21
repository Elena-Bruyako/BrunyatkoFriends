package com.bruyako.daoService;

import com.bruyako.model.Contact;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface ContactDaoService{

    public void addContact(Contact contact);
    public void deleteContact(Contact contact);
    public void addFriendship(Contact firstContact, Contact secondContact);
    public void deleteFriendship(Contact firstContact, Contact secondContact);

}


