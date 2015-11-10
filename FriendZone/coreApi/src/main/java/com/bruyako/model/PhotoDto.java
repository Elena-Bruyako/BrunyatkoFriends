package com.bruyako.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by brunyatko on 10.11.15.
 */
public class PhotoDto implements Serializable {

    private Long photoId;
    private Long contactId;
    private String name;
    private byte[] img;
    private ContactDto photoForContact;
    private LikePhotoDto likePhoto;

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public ContactDto getPhotoForContact() {
        return photoForContact;
    }

    public void setPhotoForContact(ContactDto photoForContact) {
        this.photoForContact = photoForContact;
    }

    public LikePhotoDto getLikePhoto() {
        return likePhoto;
    }

    public void setLikePhoto(LikePhotoDto likePhoto) {
        this.likePhoto = likePhoto;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "photoId=" + photoId +
                ", contactId=" + contactId +
                ", name='" + name + '\'' +
                ", img=" + Arrays.toString(img) +
                '}';
    }
}
