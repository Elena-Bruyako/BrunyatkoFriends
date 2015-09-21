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

    public void editContact(Contact contact);
    public void getAllContactByFirstName();
    public void createContact(String firstName, String lastName, LocalDate birthDate);
    public Set<Contact> getFriendList(Contact contact);
    public List<Message> getConversation(Contact firstContact, Contact secondContact);
}
