package com.bruyako;

import com.bruyako.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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
    public void createContact(ContactDto contactDto) {
        contactDao.create(contactDto);
    }

    @Override
    public void saveContact(ContactDto contactDto) {
        contactDao.saveContact(contactDto);
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
    public void setPlaceToContact(ContactDto contactDto, PlaceDto placeDto) {

        contactDao.addPlaceToContact(contactDto, placeDto);
    }

    @Override
    public void setHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {

        contactDao.addHobbyToContact(contactDto, hobbyDto);
    }

    @Override
    public void setPostToContact(ContactDto contactDto, PostDto postDto) {

        contactDao.addPostToContact(contactDto, postDto);
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
    public Set<ContactDto> addFriendList(ContactDto contactDto) {

        return contactDto.getFriends();
    }

    @Override
    public List<MessageDto> getConversation(ContactDto from, ContactDto to) {

        long contactFromId = from.getContactId();
        long contactToId = to.getContactId();

        return messageDao.getConversation(contactFromId, contactToId);
    }

    @Override
    public Set<ContactDto> getFriendList(ContactDto contactDto) {

        return contactDto.getFriends();
    }

    @Override
    public void sendMessage(String content, Long from, Long to) {
        MessageDto message = new MessageDto(LocalDateTime.now(), from, to, content);
        messageDao.storeMessage(message);
    }
}
