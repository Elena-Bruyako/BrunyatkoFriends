package com.bruyako.converters;

import com.bruyako.entity.*;
import com.bruyako.model.*;

/**
 * Created by brunyatko on 02.11.15.
 */
public class EntityDtoConverter {

    private EntityDtoConverter() {
    }

    public static AlbumDao convert(AlbumDto albumDto) {

        if (albumDto == null) {
            return null;
        }

        AlbumDao albumDao = new AlbumDao();
        albumDao.setAlbumId(albumDto.getAlbumId());
        albumDao.setContactId(albumDto.getContactId());
        albumDao.setName(albumDto.getName());

        return albumDao;
    }

    public static AlbumDto convert(AlbumDao albumDao) {

        if (albumDao == null) {
            return null;
        }

        AlbumDto albumDto = new AlbumDto();
        albumDto.setAlbumId(albumDao.getAlbumId());
        albumDto.setContactId(albumDao.getContactId());
        albumDto.setName(albumDao.getName());

        return albumDto;
    }

    public static ContactDao convert(ContactDto contactDto) {

        if (contactDto == null) {
            return null;
        }
        ContactDao contact = new ContactDao();
        contact.setContactId(contactDto.getContactId());
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setBirthDate(contactDto.getBirthDate());

        return contact;
    }

    public static ContactDto convert(ContactDao contact) {

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

    public static HobbyDao convert(HobbyDto hobbyDto) {

        if (hobbyDto == null) {
            return null;
        }

        HobbyDao hobby = new HobbyDao();
        hobby.setHobbyId(hobbyDto.getHobbyId());
        hobby.setTitle(hobbyDto.getTitle());
        hobby.setDescription(hobbyDto.getDescription());

        return hobby;
    }

    public static HobbyDto convert(HobbyDao hobby) {

        if (hobby == null) {
            return null;
        }

        HobbyDto hobbyDto = new HobbyDto();
        hobbyDto.setHobbyId(hobby.getHobbyId());
        hobbyDto.setTitle(hobby.getTitle());
        hobbyDto.setDescription(hobby.getDescription());

        return hobbyDto;
    }

    public static LikePhotoDto convert(LikePhotoDao likePhoto) {

        if (likePhoto == null){
            return null;
        }

        LikePhotoDto likePhotoDto = new LikePhotoDto();
        likePhotoDto.setLikePhotoId(likePhoto.getLikePhotoId());
        likePhotoDto.setPhotoId(likePhoto.getPhotoId());

        return likePhotoDto;
    }

    public static LikePhotoDao convert(LikePhotoDto likePhotoDto) {

        if (likePhotoDto == null){
            return null;
        }

        LikePhotoDao likePhoto = new LikePhotoDao();
        likePhoto.setLikePhotoId(likePhotoDto.getLikePhotoId());
        likePhoto.setPhotoId(likePhotoDto.getPhotoId());

        return likePhoto;
    }

    public static LikePostDto convert(LikePostDao likePost) {

        if (likePost == null){
            return null;
        }

        LikePostDto likePostDto = new LikePostDto();
        likePostDto.setLikePostId(likePost.getLikePostId());
        likePostDto.setPostId(likePost.getPostId());

        return likePostDto;
    }

    public static LikePostDao convert(LikePostDto likePostDto) {

        if (likePostDto == null){
            return null;
        }

        LikePostDao likePost = new LikePostDao();
        likePost.setLikePostId(likePostDto.getLikePostId());
        likePost.setPostId(likePostDto.getPostId());

        return likePost;
    }

    public static MessageDao convert(MessageDto messageDto){

        if (messageDto == null) {
            return null;
        }

        MessageDao message = new MessageDao();
        message.setMessageId(messageDto.getMessageId());
        message.setDate(messageDto.getDate());
        message.setContactFromId(messageDto.getContactFromId());
        message.setContactToId(messageDto.getContactToId());
        message.setContent(messageDto.getContent());

        return message;
    }

    public static MessageDto convert(MessageDao message){

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

    public static PhotoDao convert(PhotoDto photoDto) {

        if (photoDto == null) {
            return null;
        }
        PhotoDao photo = new PhotoDao();
        photo.setPhotoId(photoDto.getPhotoId());
        photo.setImg(photoDto.getImg());

        return photo;
    }

    public static PhotoDto convert(PhotoDao photo) {

        if (photo == null) {
            return null;
        }
        PhotoDto photoDto = new PhotoDto();
        photoDto.setPhotoId(photo.getPhotoId());
        photoDto.setImg(photo.getImg());

        return photoDto;
    }

    public static PlaceDao convert(PlaceDto placeDto) {

        if (placeDto == null) {
            return null;
        }

        PlaceDao place = new PlaceDao();
        place.setPlaceId(placeDto.getPlaceId());
        place.setTitle(placeDto.getTitle());
        place.setLongitude(placeDto.getLongitude());
        place.setLatitude(placeDto.getLatitude());
        place.setDescription(placeDto.getDescription());

        return place;
    }

    public static PlaceDto convert(PlaceDao place) {

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

    public static PostDao convert(PostDto postDto) {

        if (postDto == null) {
            return  null;
        }

        PostDao post = new PostDao();
        post.setPostId(postDto.getPostId());
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDate(postDto.getDate());
        post.setPostOfContact(convert(postDto.getPostOfContact()));

        return post;
    }

    public static PostDto convert(PostDao post) {

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
