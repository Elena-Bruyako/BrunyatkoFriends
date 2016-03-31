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
    private long likePhotoId;

    @Column(name = "Photo_id")
    private long photoId;

    @OneToOne
    @JoinColumn(name = "Photo_id", insertable = false, updatable = false)
    private Photo photo;

    public LikePhoto() {
    }

    public long getLikePhotoId() {
        return likePhotoId;
    }

    public void setLikePhotoId(long likePhotoId) {
        this.likePhotoId = likePhotoId;
    }

    public long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(long photoId) {
        this.photoId = photoId;
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
                ", photoId=" + photoId +
                ", photo=" + photo +
                '}';
    }
}
