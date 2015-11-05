package com.bruyako;

import com.bruyako.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
* Created by brunyatko on 24.09.15.
*/
@Transactional
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
    public void createContact(ContactDto contact) {
        contactDao.create(contact);
    }

    @Override
    public void saveContact(ContactDto contact) {
        contactDao.saveContact(contact);
    }

    @Override
    public ContactDto getContactById(Long id) {
        return contactDao.getById(id);
    }

    @Override
    public List<ContactDto> getAllContacts() {
        return contactDao.getAllContacts();
    }

    @Override
    public void deleteContactById(Long id) {
        contactDao.delete(contactDao.getById(id));
    }

    @Override
    public HobbyDto addHobby(String title, String description) {

        HobbyDto hobby = new HobbyDto(title, description);
        hobbyDao.create(hobby);

        return hobby;
    }

    @Override
    public PlaceDto addPlace(String title, String description) {

        PlaceDto place = new PlaceDto(title, description);
        placeDao.create(place);
        return place;
    }

    @Override
    public PostDto addPost(String title, String content) {

        PostDto post = new PostDto(title, content);
        postDao.create(post);
        return post;
    }

    @Override
    public void setPlaceToContact(ContactDto contact, PlaceDto place) {
        contactDao.addPlaceToContact(contact, place);
    }

    @Override
    public void setHobbyToContact(ContactDto contact, HobbyDto hobby) {
        contactDao.addHobbyToContact(contact, hobby);
    }

    @Override
    public void setPostToContact(ContactDto contact, PostDto post) {
        contactDao.addPostToContact(contact, post);
    }

    @Override
    public void addFriendship(ContactDto firstContact, ContactDto secondContact) {
        contactDao.addFriendship(firstContact, secondContact);
        contactDao.addFriendship(secondContact, firstContact);
    }

    @Override
    public void removeFriendship(ContactDto firstContact, ContactDto secondContact) {
        contactDao.deleteFriendship(firstContact, secondContact);
        contactDao.deleteFriendship(secondContact, firstContact);
    }

    @Override
    public List<ContactDto> addFriendList(ContactDto contact) {
        return contact.getFriends();
    }

    @Override
    public List<MessageDto> getConversation(ContactDto from, ContactDto to) {

        long contactFromId = from.getContactId();
        long contactToId = to.getContactId();

        return messageDao.getConversation(contactFromId, contactToId);
    }

    @Override
    public List<ContactDto> getFriendList(ContactDto contact) {

        return contact.getFriends();
    }

    @Override
    public void sendMessage(String content, Long from, Long to) {
//        MessageDto message = new MessageDto(Timestamp.valueOf(LocalDateTime.now()), from, to, content);
//        messageDao.storeMessage(message);
    }
}
