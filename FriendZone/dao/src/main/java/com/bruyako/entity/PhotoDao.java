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
public class PhotoDao implements Serializable {

    @Id
    @Column(name = "Photo_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long photoId;

    @Column(name = "Img", nullable = false)
    private byte[] img;

    @ManyToOne
    @JoinColumn(name = "Album_id")
    private AlbumDao albumOfContact;

    @ManyToOne
    @JoinColumn(name = "Contact_id")
    private ContactDao photoForContact;

    @OneToOne(mappedBy="photo")
    @Cascade(value=org.hibernate.annotations.CascadeType.ALL)
    private LikePhotoDao likePhoto;

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

    public ContactDao getPhotoForContact() {
        return photoForContact;
    }

    public void setPhotoForContact(ContactDao photoForContact) {
        this.photoForContact = photoForContact;
    }

    public LikePhotoDao getLikePhoto() {
        return likePhoto;
    }

    public void setLikePhoto(LikePhotoDao likePhoto) {
        this.likePhoto = likePhoto;
    }

    public void setPhotoId(long photoId) {
        this.photoId = photoId;
    }

    public AlbumDao getAlbumOfContact() {
        return albumOfContact;
    }

    public void setAlbumOfContact(AlbumDao albumOfContact) {
        this.albumOfContact = albumOfContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoDao photo = (PhotoDao) o;
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
