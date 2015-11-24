package com.bruyako.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Created by brunyatko on 19.11.15.
 */
@Entity
@Table(name = "Album")
public class AlbumDao implements Serializable{

    @Id
    @Column(name = "Album_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long albumId;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "Contact_id")
    private ContactDao albumOfContact;

    @OneToMany(mappedBy = "albumOfContact")
    private Set<PhotoDao> photo;

    public AlbumDao() {
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactDao getAlbumOfContact() {
        return albumOfContact;
    }

    public void setAlbumOfContact(ContactDao albumOfContact) {
        this.albumOfContact = albumOfContact;
    }

    public Set<PhotoDao> getPhoto() {
        return photo;
    }

    public void setPhoto(Set<PhotoDao> photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumDao albumDao = (AlbumDao) o;
        return Objects.equals(albumId, albumDao.albumId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId);
    }

    @Override
    public String toString() {
        return "AlbumDao{" +
                "albumId=" + albumId +
                ", name='" + name + '\'' +
                '}';
    }
}
