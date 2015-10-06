package com.bruyako;

import com.bruyako.model.*;

import java.util.Collection;

/**
 * Created by brunyatko on 24.09.15.
 */
public interface FriendZoneService {

    Collection<Contact> getAllContacts();

    Collection<Hobby> getAllHobbies();

    Collection<Place> getAllPlaces();

    Collection<Post> getAllPosts();

    Collection<Message> getAllMessages();
}
