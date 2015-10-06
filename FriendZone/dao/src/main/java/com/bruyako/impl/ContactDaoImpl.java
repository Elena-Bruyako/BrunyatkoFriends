package com.bruyako.impl;

import com.bruyako.dao.ContactDao;
import com.bruyako.model.Contact;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public class ContactDaoImpl implements ContactDao {

    private static long id = 1;
    private Map<Long, Contact> contactsMap = new HashMap<>();
    Contact contact = new Contact();

    @PostConstruct
    public void init() {

        contact.setContactId(1);
        contact.setFirstName("Elena");
        contact.setLastName("Bruyako");
        contact.setBirthDate(LocalDate.of(1990, 8, 02));

        contactsMap.put(contact.getContactId(), contact);
    }

    @Override
    public Collection<Contact> getAllContact() {
        return contactsMap.values();
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
    public void delete(Contact contact) {
        contactsMap.remove(contact);
    }

    @Override
    public Contact update(Long id) {
        return null;
    }

    @Override
    public Contact get(Long id) {
        return contactsMap.get(id);
    }
}
