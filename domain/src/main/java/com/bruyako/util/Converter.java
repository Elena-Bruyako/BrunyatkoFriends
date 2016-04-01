package com.bruyako.util;

import com.bruyako.dto.*;
import com.bruyako.entity.*;

/**
 * Created by brunyatko on 02.11.15.
 */
public class Converter {

    private Converter() {
    }

    public static Album convert(AlbumDto albumDto) {

        if (albumDto == null) {
            return null;
        }

        Album album = new Album();
        album.setAlbumId(albumDto.getAlbumId());
        album.setName(albumDto.getName());

        return album;
    }

    public static AlbumDto convert(Album album) {

        if (album == null) {
            return null;
        }

        AlbumDto albumDto = new AlbumDto();
        albumDto.setAlbumId(album.getAlbumId());
        albumDto.setName(album.getName());

        return albumDto;
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
        hobby.setHobbyId(hobbyDto.getHobbyId());
        hobby.setTitle(hobbyDto.getTitle());
        hobby.setDescription(hobbyDto.getDescription());

        return hobby;
    }

    public static HobbyDto convert(Hobby hobby) {

        if (hobby == null) {
            return null;
        }

        HobbyDto hobbyDto = new HobbyDto();
        hobbyDto.setHobbyId(hobby.getHobbyId());
        hobbyDto.setTitle(hobby.getTitle());
        hobbyDto.setDescription(hobby.getDescription());

        return hobbyDto;
    }

    public static LikePhotoDto convert(LikePhoto likePhoto) {

        if (likePhoto == null){
            return null;
        }

        LikePhotoDto likePhotoDto = new LikePhotoDto();
        likePhotoDto.setLikePhotoId(likePhoto.getLikePhotoId());
        likePhotoDto.setPhotoId(likePhoto.getPhotoId());

        return likePhotoDto;
    }

    public static LikePhoto convert(LikePhotoDto likePhotoDto) {

        if (likePhotoDto == null){
            return null;
        }

        LikePhoto likePhoto = new LikePhoto();
        likePhoto.setLikePhotoId(likePhotoDto.getLikePhotoId());
        likePhoto.setPhotoId(likePhotoDto.getPhotoId());

        return likePhoto;
    }

    public static LikePostDto convert(LikePost likePost) {

        if (likePost == null){
            return null;
        }

        LikePostDto likePostDto = new LikePostDto();
        likePostDto.setLikePostId(likePost.getLikePostId());
        likePostDto.setPostId(likePost.getPostId());

        return likePostDto;
    }

    public static LikePost convert(LikePostDto likePostDto) {

        if (likePostDto == null){
            return null;
        }

        LikePost likePost = new LikePost();
        likePost.setLikePostId(likePostDto.getLikePostId());
        likePost.setPostId(likePostDto.getPostId());

        return likePost;
    }

    public static Message convert(MessageDto messageDto){

        if (messageDto == null) {
            return null;
        }

        Message message = new Message();
        message.setMessageId(messageDto.getMessageId());
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
        messageDto.setMessageId(message.getMessageId());
        messageDto.setDate(message.getDate());
        messageDto.setContactFromId(message.getContactFromId());
        messageDto.setContactToId(message.getContactToId());
        messageDto.setContent(message.getContent());

        return messageDto;
    }

    public static Photo convert(PhotoDto photoDto) {

        if (photoDto == null) {
            return null;
        }
        Photo photo = new Photo();
        photo.setPhotoId(photoDto.getPhotoId());
        photo.setImg(photoDto.getImg());

        return photo;
    }

    public static PhotoDto convert(Photo photo) {

        if (photo == null) {
            return null;
        }
        PhotoDto photoDto = new PhotoDto();
        photoDto.setPhotoId(photo.getPhotoId());
        photoDto.setImg(photo.getImg());

        return photoDto;
    }

    public static Place convert(PlaceDto placeDto) {

        if (placeDto == null) {
            return null;
        }

        Place place = new Place();
        place.setPlaceId(placeDto.getPlaceId());
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
        placeDto.setPlaceId(place.getPlaceId());
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
        post.setPostId(postDto.getPostId());
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
        postDto.setPostId(post.getPostId());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
        postDto.setDate(post.getDate());
        postDto.setPostOfContact(convert(post.getPostOfContact()));

        return postDto;
    }

}
