package com.bruyako.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by brunyatko on 10.11.15.
 */
@Entity
@Table(name = "LikePhoto")
public class LikePhoto implements Serializable {

    @Id
    @Column(name = "LikePhoto_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long likePhotoId;

    @Column(name = "Contact_id")
    private Long contactId;

    @Column(name = "Photo_id")
    private Long photoId;

    @OneToOne
    @JoinColumn(name = "Contact_id", insertable = false, updatable = false)
    private Contact contact;

    @OneToOne
    @JoinColumn(name = "Photo_id",  insertable = false, updatable = false)
    private Photo photo;

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

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LikePhoto likePhoto = (LikePhoto) o;
        return Objects.equals(photoId, likePhoto.photoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photoId);
    }

    @Override
    public String toString() {
        return "LikePhoto{" +
                "likePhotoId=" + likePhotoId +
                ", contactId=" + contactId +
                ", photoId=" + photoId +
                '}';
    }
}
