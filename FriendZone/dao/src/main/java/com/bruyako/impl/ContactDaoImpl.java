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

import com.bruyako.converters.EntityDtoConverter;

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

        Contact contact = EntityDtoConverter.convert(contactDto);
        Contact secondContact = EntityDtoConverter.convert(secondContactDto);
        contact.getFriends().add(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteFriendship(ContactDto contactDto, ContactDto secondContactDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Contact secondContact = EntityDtoConverter.convert(secondContactDto);
        contact.getFriends().remove(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addAlbumToContact(ContactDto contactDto, AlbumDto albumDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Album album = EntityDtoConverter.convert(albumDto);
        contact.getAlbums().add(album);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteAlbumToContact(ContactDto contactDto, AlbumDto albumDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Album album = EntityDtoConverter.convert(albumDto);
        contact.getAlbums().remove(album);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Hobby hobby = EntityDtoConverter.convert(hobbyDto);
        contact.getHobbies().add(hobby);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addPlaceToContact(ContactDto contactDto, PlaceDto placeDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Place place = EntityDtoConverter.convert(placeDto);
        contact.getPlaces().add(place);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addPostToContact(ContactDto contactDto, PostDto postDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Post post = EntityDtoConverter.convert(postDto);
        contact.getPosts().add(post);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Hobby hobby = EntityDtoConverter.convert(hobbyDto);
        contact.getHobbies().remove(hobby);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deletePlaceToContact(ContactDto contactDto, PlaceDto placeDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Place place = EntityDtoConverter.convert(placeDto);
        contact.getPlaces().remove(place);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addPhotoToContact(ContactDto contactDto, PhotoDto photoDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Photo photo = EntityDtoConverter.convert(photoDto);
        contact.getAllPhotos().add(photo);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deletePhotoToContact(ContactDto contactDto, PhotoDto photoDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Photo photo = EntityDtoConverter.convert(photoDto);
        contact.getAllPhotos().remove(photo);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deletePostToContact(ContactDto contactDto, PostDto postDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        Post post = EntityDtoConverter.convert(postDto);
        contact.getPosts().remove(post);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void add(ContactDto contactDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        sessionFactory.getCurrentSession().save(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(ContactDto contactDto) {

        Contact contact = EntityDtoConverter.convert(contactDto);
        sessionFactory.getCurrentSession().delete(contact);
    }


    @Override
    public List<ContactDto> getAllContacts() {

        List<Contact> contacts = sessionFactory.getCurrentSession().createSQLQuery("select * from Contact c").addEntity(Contact.class).list();

        List<ContactDto> result = new ArrayList<ContactDto>(contacts.size());

        for (Contact contact : contacts) {
            result.add(EntityDtoConverter.convert(contact));
        }
        return result;
    }

    @Override
    public ContactDto getById(Long id) {

        List<Contact> contacts = sessionFactory.getCurrentSession().createSQLQuery("select * from Contact where Contact.Contact_id = :id").addEntity(Contact.class).setParameter("id", id).list();
        if (contacts.isEmpty()) {
            return null;
        } else {
            return EntityDtoConverter.convert(contacts.get(0));
        }
    }
}
