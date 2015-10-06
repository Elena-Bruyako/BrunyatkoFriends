package com.bruyako.dao;

import com.bruyako.model.Contact;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public interface ContactDao extends AbstractDao<Contact, Long> {

    Collection<Contact> getAllContact();

    void addFriendship(Contact firstContact, Contact secondContact);

    void deleteFriendship(Contact firstContact, Contact secondContact);

}


