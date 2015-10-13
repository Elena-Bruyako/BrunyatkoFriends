package com.bruyako.impl;

import com.bruyako.dao.ContactDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import com.bruyako.model.Place;
import com.bruyako.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class ContactDaoImpl implements ContactDao {

    private static long id = 1;
    private Map<Long, Contact> contactsMap = new HashMap<>();

    @Override
    public void addFriendship(Contact contact, Contact secondContact) {

        contact.getFriends().add(secondContact);
    }

    @Override
    public void deleteFriendship(Contact contact, Contact secondContact) {

        contact.getFriends().remove(secondContact);
    }

    @Override
    public void saveContact(Contact contact) {

    }

    @Override
    public void addHobbyToContact(Contact contact, Hobby hobby) {

        contact.getHobbies().add(hobby);
    }

    @Override
    public void addPlaceToContact(Contact contact, Place place) {

        contact.getPlaces().add(place);
    }

    @Override
    public void addPostToContact(Contact contact, Post post) {

        contact.getPosts().add(post);
    }

    @Override
    public void create(Contact contact) {

        contact.setContactId(id++);
        contactsMap.put(contact.getContactId(), contact);
    }

    @Override
    public void delete(Contact contact) {

        Long tmp = null;
        for (Map.Entry entry : contactsMap.entrySet()) {
            if (entry.getValue().equals(contact)) {
                tmp = (Long) entry.getKey();
                break;
            }
        }
        contactsMap.remove(tmp);
    }

    @Override
    public List<Contact> getAll() {

        List<Contact> allContacts = new ArrayList<>();

        for (Map.Entry entry : contactsMap.entrySet()) {
            allContacts.add((Contact)entry.getValue());
        }

        return allContacts;
    }

    @Override
    public Contact getById(Long id) {

        Contact contactById = null;
        for (Map.Entry entry : contactsMap.entrySet()) {
            if (entry.getKey().equals(id)) {
                contactById = (Contact) entry.getValue();
            }
        }

        return contactById;
    }

}
