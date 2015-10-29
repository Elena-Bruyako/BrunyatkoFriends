package com.bruyako;

import com.bruyako.dao.*;
import com.bruyako.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
* Created by brunyatko on 24.09.15.
*/
@Service
public class FriendZoneServiceImpl implements FriendZoneService{

    @Autowired
    private ContactDao contactDao;
    @Autowired
    private HobbyDao hobbyDao;
    @Autowired
    private MessageDao messageDao;
    @Autowired
    private PlaceDao placeDao;
    @Autowired
    private PostDao postDao;


    @Override
    public void createContact(Contact contact) {
        contactDao.create(contact);
    }

    @Override
    public void saveContact(Contact contact) {
        contactDao.saveContact(contact);
    }

    @Override
    public Contact getContactById(Long id) {
        return contactDao.getById(id);
    }

    @Override
    @Transactional
    public List<Contact> getAllContacts() {
        return contactDao.getAll();
    }

    @Override
    public void deleteContactById(Long id) {
        contactDao.delete(contactDao.getById(id));
    }

    @Override
    public Hobby addHobby(String title, String description) {

        Hobby hobby = new Hobby(title, description);
        hobbyDao.create(hobby);

        return hobby;
    }

    @Override
    public Place addPlace(String title, String description) {

        Place place = new Place(title, description);
        placeDao.create(place);
        return place;
    }

    @Override
    public Post addPost(String title, String content) {

        Post post = new Post(title, content);
        postDao.create(post);
        return post;
    }

    @Override
    public void setPlaceToContact(Contact contact, Place place) {
        contactDao.addPlaceToContact(contact, place);
    }

    @Override
    public void setHobbyToContact(Contact contact, Hobby hobby) {
        contactDao.addHobbyToContact(contact, hobby);
    }

    @Override
    public void setPostToContact(Contact contact, Post post) {
        contactDao.addPostToContact(contact, post);
    }

    @Override
    public void addFriendship(Contact firstContact, Contact secondContact) {
        contactDao.addFriendship(firstContact, secondContact);
        contactDao.addFriendship(secondContact, firstContact);
    }

    @Override
    public void removeFriendship(Contact firstContact, Contact secondContact) {
        contactDao.deleteFriendship(firstContact, secondContact);
        contactDao.deleteFriendship(secondContact, firstContact);
    }

    @Override
    public List<Contact> addFriendList(Contact contact) {
        return contact.getFriends();
    }

    @Override
    public List<Message> getConversation(Contact from, Contact to) {

        long contactFromId = from.getContactId();
        long contactToId = to.getContactId();

        return messageDao.getConversation(contactFromId, contactToId);
    }

    @Override
    public List<Contact> getFriendList(Contact contact) {

        return contact.getFriends();
    }

    @Override
    public void sendMessage(String content, Long from, Long to) {
        Message message = new Message(Timestamp.valueOf(LocalDateTime.now()), from, to, content);
        messageDao.storeMessage(message);
    }
}
