package com.bruyako.dto;

/**
 * Created by brunyatko on 10.11.15.
 */
public class PhotoDto {

    private long photoId;
    private byte[] img;
    private ContactDto photoForContact;
    private LikePhotoDto likePhoto;

    public long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(long photoId) {
        this.photoId = photoId;
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
                '}';
    }
}
