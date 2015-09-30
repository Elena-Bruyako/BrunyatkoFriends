package com.bruyako.impl;

import com.bruyako.dao.ContactDao;
import com.bruyako.model.Contact;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public class ContactDaoImpl implements ContactDao {

    private Map<Long, Contact> contactsMap = new HashMap<>();
    private Map<Contact, Contact> friendsMap = new HashMap<>();


    @Override
    public Collection<Contact> getAllContact() {
        return contactsMap.values();
    }

    @Override
    public void addFriendship(Contact firstContact, Contact secondContact) {
        friendsMap.put(firstContact, secondContact);
    }

    @Override
    public void removeFriendship(Contact firstContact, Contact secondContact) {
        friendsMap.remove(firstContact, secondContact);
    }

    @Override
    public void add(Contact contact) {
        contactsMap.put(contact.getContactId(), contact);
    }

    @Override
    public void edit(Contact contact) {

    }

    @Override
    public Contact get(Long id) {
        return contactsMap.get(id);
    }

    @Override
    public void remove(Contact contact) {
        contactsMap.remove(contact);
    }

    @Override
    public Contact update(Contact contact) {

        Long key = contact.getContactId();

        contactsMap.put(key, contact);

        return contactsMap.get(key);
    }
}
