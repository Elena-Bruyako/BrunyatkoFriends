package com.bruyako;

import com.bruyako.model.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface FriendZoneService {

    void createContact(Contact contact);

    void addHobby(Hobby hobby);

    void addPlace(Place place);

    void addPosts(Post post);

    void addFriendship(Contact firstContact, Contact secondContact);

    Set<Contact> addFriendList(Contact contact);

    List<Message> getConversation(Contact from, Contact to);

}
