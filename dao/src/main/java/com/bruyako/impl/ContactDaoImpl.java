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
    public void addFriendship(Long firstContactId, Long secondContactId) {

        Contact firstContact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, firstContactId);
        Contact secondContact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, secondContactId);
        firstContact.setFriend(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(firstContact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteFriendship(Long firstContactId, Long secondContactId) {

        Contact firstContact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, firstContactId);
        Contact secondContact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, secondContactId);
        firstContact.getFriends().remove(secondContact);
        sessionFactory.getCurrentSession().saveOrUpdate(firstContact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addAlbumToContact(Long contactId, Long albumId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Album album = (Album) sessionFactory.getCurrentSession().get(Album.class, albumId);
        contact.setAlbum(album);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteAlbumToContact(Long contactId, Long albumId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Album album = (Album) sessionFactory.getCurrentSession().get(Album.class, albumId);
        contact.getAlbums().remove(album);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addHobbyToContact(Long contactId, Long hobbyId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Hobby hobby = (Hobby) sessionFactory.getCurrentSession().get(Hobby.class, hobbyId);
        contact.setHobby(hobby);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteHobbyToContact(Long contactId, Long hobbyId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Hobby hobby = (Hobby) sessionFactory.getCurrentSession().get(Hobby.class, hobbyId);
        contact.getHobbies().remove(hobby);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addPlaceToContact(Long contactId, Long placeId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Place place = (Place) sessionFactory.getCurrentSession().get(Place.class, placeId);
        contact.setPlace(place);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deletePlaceToContact(Long contactId, Long placeId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Place place = (Place) sessionFactory.getCurrentSession().get(Place.class, placeId);
        contact.getPlaces().remove(place);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addPostToContact(Long contactId, Long postId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Post post = (Post) sessionFactory.getCurrentSession().get(Post.class, postId);
        contact.setPost(post);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deletePostToContact(Long contactId, Long postId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Post post = (Post) sessionFactory.getCurrentSession().get(Post.class, postId);
        contact.getPosts().remove(post);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void addPhotoToContact(Long contactId, Long photoId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Photo photo = (Photo) sessionFactory.getCurrentSession().get(Photo.class, photoId);
        contact.setPhoto(photo);
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Transactional(readOnly = false)
    @Override
    public void deletePhotoToContact(Long contactId, Long photoId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Photo photo = (Photo) sessionFactory.getCurrentSession().get(Photo.class, photoId);
        contact.getPosts().remove(photo);
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
    public void delete(Long contactId) {

        Contact contact = new Contact();
        contact.setContactId(contactId);
        sessionFactory.getCurrentSession().delete(contact);
    }


    @Override
    public List<ContactDto> getAllContacts() {

        List<Contact> contacts = sessionFactory.getCurrentSession().createQuery("from Contact c").list();

        List<ContactDto> result = new ArrayList<ContactDto>(contacts.size());

        for (Contact contact : contacts) {
            result.add(EntityDtoConverter.convert(contact));
        }
        return result;
    }

    @Override
    public ContactDto getById(Long id) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, id);
        return EntityDtoConverter.convert(contact);

    }
}
