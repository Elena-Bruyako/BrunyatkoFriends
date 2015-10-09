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
    public void addHobby(Hobby hobby) {
        hobbyDao.create(hobby);
    }

    @Override
    public void addPlace(Place place) {
        placeDao.create(place);
    }

    @Override
    public void addPosts(Post post) {
        postDao.create(post);
    }

    @Override
    public void addFriendship(Contact firstContact, Contact secondContact) {
        contactDao.addFriendship(firstContact, secondContact);
    }

    @Override
    public Set<Contact> addFriendList(Contact contact) {
        return null;
    }

    @Override
    public List<Message> getConversation(Contact from, Contact to) {
        return messageDao.getConversation(from, to);
    }
}
