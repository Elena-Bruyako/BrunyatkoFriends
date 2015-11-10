package com.bruyako.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
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
    private Long photoId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Img", nullable = false)
    private byte[] img;

    @ManyToOne
    @JoinColumn(name = "Contact_id")
    private Contact photoForContact;

    @OneToOne(mappedBy="photo")
    @Cascade(value=org.hibernate.annotations.CascadeType.ALL)
    private LikePhoto likePhoto;

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
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
                ", name='" + name + '\'' +
                ", img=" + Arrays.toString(img) +
                '}';
    }
}
