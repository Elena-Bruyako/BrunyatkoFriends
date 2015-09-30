package com.bruyako;

import com.bruyako.dao.*;
import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import com.bruyako.model.Message;
import com.bruyako.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


/**
 * Created by brunyatko on 24.09.15.
 */
@Service
public class FriendZoneServiceImpl implements FriendZoneService{

    @Autowired
    private ContactDao contactDao;
    @Autowired
    private HobbyDao hobbyDao;
    @Autowired
    private MessageDao messageDao;
    @Autowired
    private PlaceDao placeDao;
    @Autowired
    private PostDao postDao;

    @Override
    public Collection<Contact> getAllContacts() {
        return contactDao.getAllContact();
    }

    @Override
    public Collection<Hobby> getAllHobbies() {
        return hobbyDao.getAllContactsWithHobby();
    }

    @Override
    public Collection<Place> getAllPlaces() {
        return placeDao.getAllContactsForPlace();
    }

    @Override
    public void createContact(Long id, String firstName, String lastName, LocalDate birthDate) {

        Contact contact = new Contact();

        contact.setContactId(id);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setBirthDate(birthDate);
        contactDao.add(contact);
    }

    @Override
    public void addHobby(String title, String description) {

        Hobby hobby = new Hobby();

        hobby.setTitle(title);
        hobby.setDescription(description);
        hobbyDao.add(hobby);

    }

    @Override
    public void addPlace(String title, String description, double longitude, double latitude) {

        Place place = new Place();

        place.setTitle(title);
        place.setDescription(description);
        place.setLongitude(longitude);
        place.setLatitude(latitude);
        placeDao.add(place);

    }

    @Override
    public void addFriendship(Contact firstContact, Contact secondContact) {

    }

    @Override
    public Set<Contact> getFriendList(Contact contact) {
        return null;
    }

    @Override
    public List<Message> getConversation(Contact firstContact, Contact secondContact) {

        List<Message> listMessage = new ArrayList<>();


        return listMessage;
    }
}
