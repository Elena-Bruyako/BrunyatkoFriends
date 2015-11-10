package com.bruyako;

import com.bruyako.model.ContactDto;

import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface ContactService {

    void createContact(ContactDto contactDto);

    void saveContact(ContactDto contactDto);

    ContactDto getContactById (Long id);

    List<ContactDto> getAllContacts();

    void deleteContactById(Long id);

    Set<ContactDto> addFriendList(ContactDto contactDto);

    Set<ContactDto> getFriendList(ContactDto contactDto);

    void addFriendship(ContactDto firstContact, ContactDto secondContact);

    void removeFriendship(ContactDto firstContact, ContactDto secondContact);
}
