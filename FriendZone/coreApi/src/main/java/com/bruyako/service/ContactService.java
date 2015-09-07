package com.bruyako.service;

import com.bruyako.model.Contact;
import com.bruyako.model.Message;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
public interface ContactService {

    public void addContact(Contact contact);
    public void deleteContact(Contact contact);
    public void editContact(Contact contact);
    public void createContact(String firstName, String lastName, LocalDate date);
    public void addHobby(String title, String description);
    public void addPlace(String title, double longitude, double latitude, String description);
    public void addFriendship(Contact contact);
    public void deleteFriendship(Contact contact);
    public Set<Contact> getFriendList(Contact contact);
    public List<Message> getConversation(Contact firstContact, Contact secondContact);
}
