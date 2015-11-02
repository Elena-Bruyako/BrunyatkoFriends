package com.bruyako;

import com.bruyako.model.*;

import java.util.List;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface FriendZoneService {

    void createContact(ContactDto contact);

    void saveContact(ContactDto contact);

    ContactDto getContactById (Long id);

    List<ContactDto> getAllContacts();

    void deleteContactById(Long id);

    HobbyDto addHobby(String title, String description);

    PlaceDto addPlace(String title, String description);

    PostDto addPost(String title, String content);

    void setPlaceToContact(ContactDto contact, PlaceDto place);

    void setHobbyToContact(ContactDto contact, HobbyDto hobby);

    void setPostToContact(ContactDto contact, PostDto post);

    void addFriendship(ContactDto firstContact, ContactDto secondContact);

    void removeFriendship(ContactDto firstContact, ContactDto secondContact);

    List<ContactDto> addFriendList(ContactDto contact);

    List<MessageDto> getConversation(ContactDto from, ContactDto to);

    List<ContactDto> getFriendList(ContactDto contact);

    void sendMessage(String content, Long from, Long to);

}
