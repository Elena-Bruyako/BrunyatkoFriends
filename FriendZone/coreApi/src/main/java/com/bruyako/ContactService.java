package com.bruyako;

import com.bruyako.model.*;

import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface ContactService {

    void addContact(ContactDto contactDto);

    void deleteContact(ContactDto contactDto);

    Set<ContactDto> addFriendList(ContactDto contactDto);

    Set<ContactDto> getFriendList(ContactDto contactDto);

    List<ContactDto> getAllContacts();

    ContactDto getContactById (Long contactId);

    void addFriendship(ContactDto contactDto, ContactDto secondContactDto);

    void deleteFriendship(ContactDto contactDto, ContactDto secondContactDto);

    void addAlbumToContact(ContactDto contactDto, AlbumDto albumDto);

    void deleteAlbumToContact(ContactDto contactDto, AlbumDto albumDto);

    void addHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto);

    void deleteHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto);

    void addPlaceToContact(ContactDto contactDto, PlaceDto placeDto);

    void deletePlaceToContact(ContactDto contactDto, PlaceDto placeDto);

    void addPhotoToContact(ContactDto contactDto, PhotoDto photoDto);

    void deletePhotoToContact(ContactDto contactDto, PhotoDto photoDto);

    void addPostToContact(ContactDto contactDto, PostDto postDto);

    void deletePostToContact(ContactDto contactDto, PostDto postDto);
}
