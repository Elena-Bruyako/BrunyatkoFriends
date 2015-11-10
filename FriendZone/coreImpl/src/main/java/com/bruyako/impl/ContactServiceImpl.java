package com.bruyako.impl;

import com.bruyako.ContactDao;
import com.bruyako.ContactService;
import com.bruyako.model.ContactDto;
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
    private ContactDao contactDao;

    @Override
    public void createContact(ContactDto contactDto) {
        contactDao.create(contactDto);
    }

    @Override
    public void saveContact(ContactDto contactDto) {
        contactDao.saveContact(contactDto);
    }

    @Override
    public ContactDto getContactById(Long id) {
        return contactDao.getById(id);
    }

    @Override
    public List<ContactDto> getAllContacts() {
        return contactDao.getAllContacts();
    }

    @Override
    public void deleteContactById(Long id) {
        contactDao.delete(contactDao.getById(id));
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
    public void removeFriendship(ContactDto firstContact, ContactDto secondContact) {

        contactDao.deleteFriendship(firstContact, secondContact);
        contactDao.deleteFriendship(secondContact, firstContact);
    }
}
