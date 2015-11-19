package com.bruyako.impl;

import com.bruyako.ContactDaoInterface;
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
public class ContactDaoImpl implements ContactDaoInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addFriendship(ContactDto contactDto, ContactDto secondContactDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        ContactDao secondContact = EntityDtoConverter.convert(secondContactDto);
        contact.getFriends().add(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteFriendship(ContactDto contactDto, ContactDto secondContactDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        ContactDao secondContact = EntityDtoConverter.convert(secondContactDto);
        contact.getFriends().remove(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addAlbumToContact(ContactDto contactDto, AlbumDto albumDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        AlbumDao albumDao = EntityDtoConverter.convert(albumDto);
        contact.getAlbums().add(albumDao);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteAlbumToContact(ContactDto contactDto, AlbumDto albumDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        AlbumDao albumDao = EntityDtoConverter.convert(albumDto);
        contact.getAlbums().remove(albumDao);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        HobbyDao hobby = EntityDtoConverter.convert(hobbyDto);
        contact.getHobbies().add(hobby);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addPlaceToContact(ContactDto contactDto, PlaceDto placeDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        PlaceDao place = EntityDtoConverter.convert(placeDto);
        contact.getPlaces().add(place);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addPostToContact(ContactDto contactDto, PostDto postDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        PostDao post = EntityDtoConverter.convert(postDto);
        contact.getPosts().add(post);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        HobbyDao hobby = EntityDtoConverter.convert(hobbyDto);
        contact.getHobbies().remove(hobby);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deletePlaceToContact(ContactDto contactDto, PlaceDto placeDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        PlaceDao place = EntityDtoConverter.convert(placeDto);
        contact.getPlaces().remove(place);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addPhotoToContact(ContactDto contactDto, PhotoDto photoDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        PhotoDao photoDao = EntityDtoConverter.convert(photoDto);
        contact.getAllPhotos().add(photoDao);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deletePhotoToContact(ContactDto contactDto, PhotoDto photoDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        PhotoDao photoDao = EntityDtoConverter.convert(photoDto);
        contact.getAllPhotos().remove(photoDao);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deletePostToContact(ContactDto contactDto, PostDto postDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        PostDao post = EntityDtoConverter.convert(postDto);
        contact.getPosts().remove(post);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void add(ContactDto contactDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        sessionFactory.getCurrentSession().save(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(ContactDto contactDto) {

        ContactDao contact = EntityDtoConverter.convert(contactDto);
        sessionFactory.getCurrentSession().delete(contact);
    }


    @Override
    public List<ContactDto> getAllContacts() {

        List<ContactDao> contacts = sessionFactory.getCurrentSession().createSQLQuery("from Contact").list();
        List<ContactDto> result = new ArrayList<ContactDto>(contacts.size());
        for (ContactDao contact : contacts) {
            result.add(EntityDtoConverter.convert(contact));
        }
        return result;
    }

    @Override
    public ContactDto getById(Long id) {

        List<ContactDao> contacts = sessionFactory.getCurrentSession().createSQLQuery("select c from Contact c where c.id = :id").setParameter("id", id).list();
        if (contacts.isEmpty()) {
            return null;
        } else {
            return EntityDtoConverter.convert(contacts.get(0));
        }
    }
}
