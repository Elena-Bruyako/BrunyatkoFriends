package com.bruyako;

import com.bruyako.model.*;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface ContactDao extends AbstractDao<ContactDto, Long> {

    List<ContactDto> getAllContacts();

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


