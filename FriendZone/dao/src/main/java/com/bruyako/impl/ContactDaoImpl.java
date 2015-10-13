package com.bruyako.impl;

import com.bruyako.dao.ContactDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import com.bruyako.model.Place;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
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

    @PostConstruct
    public void init() {

        Contact contact = new Contact();

        contact.setContactId(1);
        contact.setFirstName("Elena");
        contact.setLastName("Bruyako");
        contact.setBirthDate(LocalDate.of(1990, 8, 02));

        contactsMap.put(contact.getContactId(), contact);
    }

    @Override
    public void addFriendship(Contact firstContact, Contact secondContact) {

    }

    @Override
    public void deleteFriendship(Contact firstContact, Contact secondContact) {

    }

    @Override
    public void saveContact(Contact contact) {

    }

    @Override
    public void addHobbyToContact(Contact contact, Hobby hobby) {

    }

    @Override
    public void addPlaceToContact(Contact contact, Place place) {

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
    public void update(Contact contact) {


    }

    @Override
    public List<Contact> getAll() {
        return null;
    }

    @Override
    public Contact getById(Long id) {
        return null;
    }

}
