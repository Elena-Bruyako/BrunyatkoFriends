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
    public void addContact(Contact contact) {

    }

    @Override
    public void deleteContact(Contact contact) {

    }

    @Override
    public void editContact(Contact contact) {

    }

    @Override
    public void createContact(String firstName, String lastName, LocalDate date) {

    }

    @Override
    public void addHobby(String title, String description) {

    }

    @Override
    public void addPlace(String title, double longitude, double latitude, String description) {

    }

    @Override
    public void addFriendship(Contact contact) {

    }

    @Override
    public void deleteFriendship(Contact contact) {

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
