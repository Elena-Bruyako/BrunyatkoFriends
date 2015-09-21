package com.bruyako.impl;

import com.bruyako.model.Contact;
import com.bruyako.model.Message;
import com.bruyako.service.ContactService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 10.09.15.
 */
public class ContactImpl implements ContactService {

    @Override
    public void editContact(Contact contact) {

    }

    @Override
    public void getAllContactByFirstName() {

    }

    @Override
    public void createContact(String firstName, String lastName, LocalDate birthDate) {

    }

    @Override
    public Set<Contact> getFriendList(Contact contact) {
        return null;
    }

    @Override
    public List<Message> getConversation(Contact firstContact, Contact secondContact) {
        return null;
    }
}
