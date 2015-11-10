package com.bruyako;

import com.bruyako.model.ContactDto;
import com.bruyako.model.HobbyDto;
import com.bruyako.model.PlaceDto;
import com.bruyako.model.PostDto;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface ContactDao extends AbstractDao<ContactDto, Long> {

    List<ContactDto> getAllContacts();

    void addFriendship(ContactDto contactDto, ContactDto secondContactDto);

    void deleteFriendship(ContactDto contactDto, ContactDto secondContactDto);

    void saveContact(ContactDto contactDto);

    void addHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto);

    void addPlaceToContact(ContactDto contactDto, PlaceDto placeDto);

    void addPostToContact(ContactDto contactDto, PostDto postDto);

    void deleteHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto);

    void deletePlaceToContact(ContactDto contactDto, PlaceDto placeDto);

    void deletePostToContact(ContactDto contactDto, PostDto postDto);

}


