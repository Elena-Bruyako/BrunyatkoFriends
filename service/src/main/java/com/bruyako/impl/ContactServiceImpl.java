package com.bruyako.impl;

import com.bruyako.*;
import com.bruyako.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;

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
    public void deleteContact(Long contactId) {

        contactDao.delete(contactId);
    }

    @Override
    public void addFriendship(Long firstContactId, Long secondContactId) {

        contactDao.addFriendship(firstContactId, secondContactId);
        contactDao.addFriendship(secondContactId, firstContactId);
    }

    @Override
    public void deleteFriendship(Long firstContactId, Long secondContactId) {

        contactDao.deleteFriendship(firstContactId, secondContactId);
        contactDao.deleteFriendship(secondContactId, firstContactId);
    }

    @Override
    public void addAlbumToContact(Long contactId, Long albumId) {
        contactDao.addAlbumToContact(contactId, albumId);
    }

    @Override
    public void deleteAlbumToContact(Long contactId, Long albumId) {
        contactDao.deleteAlbumToContact(contactId, albumId);
    }

    @Override
    public void addHobbyToContact(Long contactId, Long hobbyId) {

        contactDao.addHobbyToContact(contactId, hobbyId);
    }

    @Override
    public void deleteHobbyToContact(Long contactId, Long hobbyId) {
        contactDao.deleteHobbyToContact(contactId, hobbyId);
    }

    @Override
    public void addPlaceToContact(Long contactId, Long placeId) {
        contactDao.addPlaceToContact(contactId, placeId);
    }

    @Override
    public void deletePlaceToContact(Long contactId, Long placeId) {
        contactDao.deletePlaceToContact(contactId, placeId);
    }

    @Override
    public void addPhotoToContact(Long contactId, Long photoId) {
        contactDao.addPhotoToContact(contactId, photoId);
    }

    @Override
    public void deletePhotoToContact(Long contactId, Long photoId) {
        contactDao.deletePhotoToContact(contactId, photoId);
    }

    @Override
    public void addPostToContact(Long contactId, Long postId) {
        contactDao.addPostToContact(contactId, postId);
    }

    @Override
    public void deletePostToContact(Long contactId, Long postId) {
        contactDao.deletePostToContact(contactId, postId);
    }


}
