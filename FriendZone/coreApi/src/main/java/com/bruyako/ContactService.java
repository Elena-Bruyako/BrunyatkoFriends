package com.bruyako;

import com.bruyako.model.*;

import java.util.List;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface ContactService {

    void addContact(ContactDto contactDto);

    void deleteContact(Long contactId);

    List<ContactDto> getAllContacts();

    ContactDto getContactById (Long contactId);

    void addFriendship(Long firstContactId, Long secondContactId);

    void deleteFriendship(Long firstContactId, Long secondContactId);

    void addAlbumToContact(Long contactId, Long albumId);

    void deleteAlbumToContact(Long contactId, Long albumId);

    void addHobbyToContact(Long contactId, Long hobbyId);

    void deleteHobbyToContact(Long contactId, Long hobbyId);

    void addPlaceToContact(Long contactId, Long placeId);

    void deletePlaceToContact(Long contactId, Long placeId);

    void addPhotoToContact(Long contactId, Long photoId);

    void deletePhotoToContact(Long contactId, Long photoId);

    void addPostToContact(Long contactId, Long postId);

    void deletePostToContact(Long contactId, Long postId);
}
