package com.bruyako.impl;

import com.bruyako.ContactDao;
import com.bruyako.entity.*;
import com.bruyako.model.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static com.bruyako.converters.EntityDtoConverter.convert;

/**
 * Created by brunyatko on 21.09.15.
 */
@Transactional
@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addFriendship(ContactDto contactDto, ContactDto secondContactDto) {

        Contact contact = convert(contactDto);
        Contact secondContact = convert(secondContactDto);
        contact.getFriends().add(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteFriendship(ContactDto contactDto, ContactDto secondContactDto) {

        Contact contact = convert(contactDto);
        Contact secondContact = convert(secondContactDto);
        contact.getFriends().remove(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    public void saveContact(ContactDto contactDto) {

        Contact contact = convert(contactDto);
        sessionFactory.getCurrentSession().persist(contact);
    }

    @Override
    public void addHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {

        Contact contact = convert(contactDto);
        Hobby hobby = convert(hobbyDto);
        contact.getHobbies().add(hobby);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    public void addPlaceToContact(ContactDto contactDto, PlaceDto placeDto) {

        Contact contact = convert(contactDto);
        Place place = convert(placeDto);
        contact.getPlaces().add(place);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    public void addPostToContact(ContactDto contactDto, PostDto postDto) {

        Contact contact = convert(contactDto);
        Post post = convert(postDto);
        contact.getPosts().add(post);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    public void deleteHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {


    }

    @Override
    public void deletePlaceToContact(ContactDto contactDto, PlaceDto placeDto) {

    }

    @Override
    public void deletePostToContact(ContactDto contactDto, PostDto postDto) {

    }

    @Transactional(readOnly = false)
    @Override
    public Long create(ContactDto contactDto) {

        Contact contact = convert(contactDto);
        sessionFactory.getCurrentSession().save(contact);
        return contact.getContactId();
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(ContactDto contactDto) {

        Contact contact = convert(contactDto);
        sessionFactory.getCurrentSession().delete(contact);
    }

    @Override
    public List<ContactDto> getAllContacts() {

        List<Contact> contacts = sessionFactory.getCurrentSession().createQuery("from Contact").list();
        List<ContactDto> result = new ArrayList<ContactDto>(contacts.size());
        for (Contact contact : contacts) {
            result.add(convert(contact));
        }
        return result;
    }

    @Override
    public ContactDto getById(Long id) {

        List<Contact> contacts = sessionFactory.getCurrentSession().createQuery("select c from Contact c where c.id = :id").setParameter("id", id).list();
        if (contacts.isEmpty()) {
            return null;
        } else {
            return convert(contacts.get(0));
        }
    }
}
