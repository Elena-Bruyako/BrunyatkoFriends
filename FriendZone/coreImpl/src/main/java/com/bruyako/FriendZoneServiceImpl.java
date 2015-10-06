//package com.bruyako;
//
//import com.bruyako.dao.*;
//import com.bruyako.model.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//
//
///**
// * Created by brunyatko on 24.09.15.
// */
//@Service
//public class FriendZoneServiceImpl implements FriendZoneService{
//
//    @Autowired
//    private ContactDao contactDao;
//    @Autowired
//    private HobbyDao hobbyDao;
//    @Autowired
//    private MessageDao messageDao;
//    @Autowired
//    private PlaceDao placeDao;
//    @Autowired
//    private PostDao postDao;
//
//    @Override
//    public Collection<Contact> getAllContacts() {
//        return contactDao.getAllContact();
//    }
//
//    @Override
//    public Collection<Hobby> getAllHobbies() {
//        return hobbyDao.getAllContactsWithHobby();
//    }
//
//    @Override
//    public Collection<Place> getAllPlaces() {
//        return placeDao.getAllContactsForPlace();
//    }
//
//    @Override
//    public Collection<Post> getAllPosts() {
//        return postDao.getAllPostsForContact();
//    }
//
//    @Override
//    public Collection<Message> getAllMessages() {
//        return messageDao.getConversation();
//    }
//}
