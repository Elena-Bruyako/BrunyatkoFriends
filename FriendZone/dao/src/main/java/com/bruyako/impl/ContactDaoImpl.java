package com.bruyako.impl;

import com.bruyako.dao.ContactDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import com.bruyako.model.Place;
import com.bruyako.model.Post;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
@Transactional
@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private SessionFactory sessionFactory;

//    private static long id = 1;
//    private Map<Long, Contact> contactsMap = new HashMap<>();

    @Override
    public void addFriendship(Contact contact, Contact secondContact) {

        contact.getFriends().add(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    public void deleteFriendship(Contact contact, Contact secondContact) {

        contact.getFriends().remove(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    public void saveContact(Contact contact) {
        sessionFactory.getCurrentSession().persist(contact);
    }

    @Override
    public void addHobbyToContact(Contact contact, Hobby hobby) {

        contact.getHobbies().add(hobby);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    public void addPlaceToContact(Contact contact, Place place) {

        contact.getPlaces().add(place);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    public void addPostToContact(Contact contact, Post post) {

        contact.getPosts().add(post);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    public void create(Contact contact) {

        sessionFactory.getCurrentSession().save(contact);
//        contact.setContactId(id++);
//        contactsMap.put(contact.getContactId(), contact);
    }

    @Override
    public void delete(Contact contact) {

        sessionFactory.getCurrentSession().delete(contact);
//        Long tmp = null;
//        for (Map.Entry entry : contactsMap.entrySet()) {
//            if (entry.getValue().equals(contact)) {
//                tmp = (Long) entry.getKey();
//                break;
//            }
//        }
//        contactsMap.remove(tmp);
    }

    @Override
    public List<Contact> getAll() {

        return sessionFactory.getCurrentSession().createQuery("from Contact").list();

//        List<Contact> allContacts = new ArrayList<>();
//
//        for (Map.Entry entry : contactsMap.entrySet()) {
//            allContacts.add((Contact)entry.getValue());
//        }

//        return allContacts;
    }

    @Override
    public Contact getById(Long id) {

        Contact contact = sessionFactory.getCurrentSession().get(Contact.class, id);
        return contact;

//        Contact contactById = null;
//        for (Map.Entry entry : contactsMap.entrySet()) {
//            if (entry.getKey().equals(id)) {
//                contactById = (Contact) entry.getValue();
//            }
//        }
//
//        return contactById;
    }
}
