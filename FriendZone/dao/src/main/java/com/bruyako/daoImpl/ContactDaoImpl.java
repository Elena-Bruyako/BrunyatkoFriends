package com.bruyako.daoImpl;

import com.bruyako.daoService.ContactDaoService;
import com.bruyako.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public class ContactDaoImpl extends Contact implements ContactDaoService {

    @Autowired
    private List<Contact> contacts;
    @Qualifier(value = "Elena")
    @Autowired
    private Contact elena;

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    @Override
    public void addFriendship(Contact firstContact, Contact secondContact) {

    }

    @Override
    public void deleteFriendship(Contact firstContact, Contact secondContact) {

    }
}
