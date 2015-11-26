package com.bruyako.impl;

import com.bruyako.ContactDaoInterface;
import com.bruyako.ContactService;
import com.bruyako.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDaoInterface contactDao;

    @Override
    public void addContact(ContactDto contactDto) {
        contactDao.add(contactDto);
    }

    @Override
    public ContactDto getContactById(Long contactId) {
        return contactDao.getById(contactId);
    }

    @Override
    public List<ContactDto> getAllContacts() {
        return contactDao.getAllContacts();
    }

    @Override
    public void deleteContact(ContactDto contactDto) {
        contactDao.delete(contactDto);
    }

    @Override
    public Set<ContactDto> addFriendList(ContactDto contactDto) {

        return contactDto.getFriends();
    }

    @Override
    public Set<ContactDto> getFriendList(ContactDto contactDto) {

        return contactDto.getFriends();
    }

    @Override
    public void addFriendship(ContactDto firstContact, ContactDto secondContact) {

        contactDao.addFriendship(firstContact, secondContact);
        contactDao.addFriendship(secondContact, firstContact);
    }

    @Override
    public void addAlbumToContact(ContactDto contactDto, AlbumDto albumDto) {
        contactDao.addAlbumToContact(contactDto, albumDto);
    }

    @Override
    public void deleteAlbumToContact(ContactDto contactDto, AlbumDto albumDto) {
        contactDao.deleteAlbumToContact(contactDto, albumDto);
    }

    @Override
    public void addHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {
        contactDao.addHobbyToContact(contactDto, hobbyDto);
    }

    @Override
    public void deleteHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {
        contactDao.deleteHobbyToContact(contactDto, hobbyDto);
    }

    @Override
    public void addPlaceToContact(ContactDto contactDto, PlaceDto placeDto) {
        contactDao.addPlaceToContact(contactDto, placeDto);
    }

    @Override
    public void deletePlaceToContact(ContactDto contactDto, PlaceDto placeDto) {
        contactDao.deletePlaceToContact(contactDto, placeDto);
    }

    @Override
    public void addPhotoToContact(ContactDto contactDto, PhotoDto photoDto) {
        contactDao.addPhotoToContact(contactDto, photoDto);
    }

    @Override
    public void deletePhotoToContact(ContactDto contactDto, PhotoDto photoDto) {
        contactDao.deletePhotoToContact(contactDto, photoDto);
    }

    @Override
    public void addPostToContact(ContactDto contactDto, PostDto postDto) {
        contactDao.addPostToContact(contactDto, postDto);
    }

    @Override
    public void deletePostToContact(ContactDto contactDto, PostDto postDto) {
        contactDao.deletePostToContact(contactDto, postDto);
    }

    @Override
    public void deleteFriendship(ContactDto firstContact, ContactDto secondContact) {

        contactDao.deleteFriendship(firstContact, secondContact);
        contactDao.deleteFriendship(secondContact, firstContact);
    }
}
