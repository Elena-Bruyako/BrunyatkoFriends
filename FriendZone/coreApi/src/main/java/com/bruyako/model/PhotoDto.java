package com.bruyako.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by brunyatko on 10.11.15.
 */
public class PhotoDto implements Serializable {

    private long photoId;
    private String name;
    private byte[] img;
    private ContactDto photoForContact;
    private LikePhotoDto likePhoto;

    public PhotoDto() {
    }

    public long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(long photoId) {
        this.photoId = photoId;
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
        return "PhotoDto{" +
                "photoId=" + photoId +
                ", name='" + name + '\'' +
                ", img=" + Arrays.toString(img) +
                '}';
    }
}