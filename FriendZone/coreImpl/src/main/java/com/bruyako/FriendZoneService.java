package com.bruyako;

import com.bruyako.model.*;

import java.util.List;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface FriendZoneService {

    void createContact(Contact contact);

    void saveContact(Contact contact);

    Contact getContactById (Long id);

    List<Contact> getAllContacts();

    void deleteContactById(Long id);

    Hobby addHobby(String title, String description);

    Place addPlace(String title, String description);

    Post addPost(String title, String content);

    void setPlaceToContact(Contact contact, Place place);

    void setHobbyToContact(Contact contact, Hobby hobby);

    void setPostToContact(Contact contact, Post post);

    void addFriendship(Contact firstContact, Contact secondContact);

    void removeFriendship(Contact firstContact, Contact secondContact);

    List<Contact> addFriendList(Contact contact);

    List<Message> getConversation(Contact from, Contact to);

    List<Contact> getFriendList(Contact contact);

    void sendMessage(String content, Contact from, Contact to);

}
