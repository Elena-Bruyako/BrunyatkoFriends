package com.bruyako.converters;

import com.bruyako.entity.*;
import com.bruyako.model.*;

/**
 * Created by brunyatko on 02.11.15.
 */
public class EntityDtoConverter {

    private EntityDtoConverter() {
    }

    public static Contact convert(ContactDto contactDto) {

        if (contactDto == null) {
            return null;
        }
        Contact contact = new Contact();
        contact.setContactId(contactDto.getContactId());
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setBirthDate(contactDto.getBirthDate());

        return contact;
    }

    public static ContactDto convert(Contact contact) {

        if (contact == null) {
            return null;
        }
        ContactDto contactDto = new ContactDto();
        contactDto.setContactId(contact.getContactId());
        contactDto.setFirstName(contact.getFirstName());
        contactDto.setLastName(contact.getLastName());
        contactDto.setBirthDate(contact.getBirthDate());

        return contactDto;
    }

    public static Hobby convert(HobbyDto hobbyDto) {

        if (hobbyDto == null) {
            return null;
        }

        Hobby hobby = new Hobby();
        hobby.setId(hobbyDto.getId());
        hobby.setTitle(hobbyDto.getTitle());
        hobby.setDescription(hobbyDto.getDescription());
        return hobby;
    }

    public static HobbyDto convert(Hobby hobby) {

        if (hobby == null) {
            return null;
        }

        HobbyDto hobbyDto = new HobbyDto();
        hobbyDto.setId(hobby.getId());
        hobbyDto.setTitle(hobby.getTitle());
        hobbyDto.setDescription(hobby.getDescription());
        return hobbyDto;
    }

    public static Message convert(MessageDto messageDto){

        if (messageDto == null) {
            return null;
        }

        Message message = new Message();
        message.setId(messageDto.getId());
        message.setDate(messageDto.getDate());
        message.setContactFromId(messageDto.getContactFromId());
        message.setContactToId(messageDto.getContactToId());
        message.setContent(messageDto.getContent());

        return message;
    }

    public static MessageDto convert(Message message){

        if (message == null) {
            return null;
        }

        MessageDto messageDto = new MessageDto();
        messageDto.setId(message.getId());
        messageDto.setDate(message.getDate());
        messageDto.setContactFromId(message.getContactFromId());
        messageDto.setContactToId(message.getContactToId());
        messageDto.setContent(message.getContent());

        return messageDto;
    }

    public static Place convert(PlaceDto placeDto) {

        if (placeDto == null) {
            return null;
        }

        Place place = new Place();
        place.setId(placeDto.getId());
        place.setTitle(placeDto.getTitle());
        place.setLongitude(placeDto.getLongitude());
        place.setLatitude(placeDto.getLatitude());
        place.setDescription(placeDto.getDescription());

        return place;
    }

    public static PlaceDto convert(Place place) {

        if (place == null) {
            return null;
        }

        PlaceDto placeDto = new PlaceDto();
        placeDto.setId(place.getId());
        placeDto.setTitle(place.getTitle());
        placeDto.setLongitude(place.getLongitude());
        placeDto.setLatitude(place.getLatitude());
        placeDto.setDescription(place.getDescription());

        return placeDto;
    }

    public static Post convert(PostDto postDto) {

        if (postDto == null) {
            return  null;
        }

        Post post = new Post();
        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDate(postDto.getDate());
        post.setPostOfContact(convert(postDto.getPostOfContact()));

        return post;
    }

    public static PostDto convert(Post post) {

        if (post == null) {
            return  null;
        }

        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
        postDto.setDate(post.getDate());
        postDto.setPostOfContact(convert(post.getPostOfContact()));

        return postDto;
    }
}
