package com.bruyako.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by brunyatko on 10.11.15.
 */
@Entity
@Table(name = "Photo")
public class Photo implements Serializable {

    @Id
    @Column(name = "Photo_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long photoId;

    @Column(name = "Img")
    private byte[] img;

    @ManyToOne
    @JoinColumn(name = "Album_id")
    private Album albumOfContact;

    @ManyToOne
    @JoinColumn(name = "Contact_id")
    private Contact photoForContact;

    @OneToOne(mappedBy="photo")
    @Cascade(value=org.hibernate.annotations.CascadeType.ALL)
    private LikePhoto likePhoto;

    public Photo() {
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public Contact getPhotoForContact() {
        return photoForContact;
    }

    public void setPhotoForContact(Contact photoForContact) {
        this.photoForContact = photoForContact;
    }

    public LikePhoto getLikePhoto() {
        return likePhoto;
    }

    public void setLikePhoto(LikePhoto likePhoto) {
        this.likePhoto = likePhoto;
    }

    public Album getAlbumOfContact() {
        return albumOfContact;
    }

    public void setAlbumOfContact(Album albumOfContact) {
        this.albumOfContact = albumOfContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(photoId, photo.photoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photoId);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "photoId=" + photoId +
                '}';
    }
}
