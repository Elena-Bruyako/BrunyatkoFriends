package com.bruyako.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by brunyatko on 10.11.15.
 */
public class LikePhotoDto implements Serializable {

    private Long likePhotoId;
    private Long contactId;
    private Long photoId;
    private ContactDto contactDto;
    private PhotoDto photoDto;

    public LikePhotoDto() {
    }

    public LikePhotoDto(Long photoId, Long likePhotoId, Long contactId) {
        this.photoId = photoId;
        this.likePhotoId = likePhotoId;
        this.contactId = contactId;
    }

    public Long getLikePhotoId() {
        return likePhotoId;
    }

    public void setLikePhotoId(Long likePhotoId) {
        this.likePhotoId = likePhotoId;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public ContactDto getContactDto() {
        return contactDto;
    }

    public void setContactDto(ContactDto contactDto) {
        this.contactDto = contactDto;
    }

    public PhotoDto getPhotoDto() {
        return photoDto;
    }

    public void setPhotoDto(PhotoDto photoDto) {
        this.photoDto = photoDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LikePhotoDto likePhotoDto = (LikePhotoDto) o;

        return Objects.equals(likePhotoId, likePhotoDto.likePhotoId) &&
                Objects.equals(contactId, likePhotoDto.contactId) &&
                Objects.equals(photoId, likePhotoDto.photoId);

    }

    @Override
    public int hashCode() {
        return Objects.hash(likePhotoId);
    }

    @Override
    public String toString() {
        return "LikePhotoDto{" +
                "likePhotoId=" + likePhotoId +
                ", contactId=" + contactId +
                ", photoId=" + photoId +
                '}';
    }
}
