package com.bruyako;

import com.bruyako.model.*;

import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface FriendZoneService {

    void createContact(ContactDto contactDto);

    void saveContact(ContactDto contactDto);

    ContactDto getContactById (Long id);

    List<ContactDto> getAllContacts();

    void deleteContactById(Long id);

    HobbyDto addHobby(String title, String description);

    PlaceDto addPlace(String title, String description);

    PostDto addPost(String title, String content);

    void setPlaceToContact(ContactDto contactDto, PlaceDto placeDto);

    void setHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto);

    void setPostToContact(ContactDto contactDto, PostDto postDto);

    void addFriendship(ContactDto firstContact, ContactDto secondContact);

    void removeFriendship(ContactDto firstContact, ContactDto secondContact);

    Set<ContactDto> addFriendList(ContactDto contactDto);

    List<MessageDto> getConversation(ContactDto from, ContactDto to);

    Set<ContactDto> getFriendList(ContactDto contactDto);

    void sendMessage(String content, Long from, Long to);

}
