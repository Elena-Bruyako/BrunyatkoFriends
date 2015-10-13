package com.bruyako;

import com.bruyako.dao.*;
import com.bruyako.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

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
    public List<Contact> getAllContacts() {
        return contactDao.getAll();
    }

    @Override
    public void deleteContactById(Long id) {
        contactDao.delete(contactDao.getById(id));
    }

    @Override
    public Hobby addHobby(String title, String description) {
        return null;
    }

    @Override
    public Place addPlace(String title, String description) {
        return null;
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
    public void addFriendship(Contact firstContact, Contact secondContact) {
        contactDao.addFriendship(firstContact, secondContact);
    }

    @Override
    public void removeFriendship(Contact firstContact, Contact secondContact) {
        contactDao.deleteFriendship(firstContact, secondContact);
    }

    @Override
    public Set<Contact> addFriendList(Contact contact) {
        return null;
    }

    @Override
    public List<Message> getConversation(Contact from, Contact to) {
        return null;
    }

    @Override
    public List<Contact> getFriendList(Contact contact) {
        return null;
    }

    @Override
    public void sendMessage(String content, Contact from, Contact to) {

    }
}
