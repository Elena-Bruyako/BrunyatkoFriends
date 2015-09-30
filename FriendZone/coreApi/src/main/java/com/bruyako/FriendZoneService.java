package com.bruyako;


import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import com.bruyako.model.Message;
import com.bruyako.model.Place;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface FriendZoneService {

    Collection<Contact> getAllContacts();

    Collection<Hobby> getAllHobbies();

    Collection<Place> getAllPlaces();

    void createContact(Long id, String firstName, String lastName, LocalDate birthDate);

    void addHobby(String title, String description);

    void addPlace(String title, String description, double longitude, double latitude);

    void addFriendship(Contact firstContact, Contact secondContact);

    Set<Contact> getFriendList(Contact contact);

    List<Message> getConversation(Contact firstContact, Contact secondContact);

}
