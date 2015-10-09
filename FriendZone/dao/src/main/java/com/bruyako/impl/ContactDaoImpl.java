package com.bruyako.impl;

import com.bruyako.dao.ContactDao;
import com.bruyako.model.Contact;
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
    private Contact contact;

    @PostConstruct
    public void init() {

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
    public void create(Contact contact) {
        contact.setContactId(id++);
        contactsMap.put(contact.getContactId(), contact);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Contact contact) {

    }

    @Override
    public List<Contact> getAll() {
        return null;
    }

}
