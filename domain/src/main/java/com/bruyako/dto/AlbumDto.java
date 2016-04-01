package com.bruyako.dto;

/**
 * Created by brunyatko on 19.11.15.
 */
public class AlbumDto{

    private long albumId;
    private long contactId;
    private String name;

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AlbumDto{" +
                "albumId=" + albumId +
                ", contactId=" + contactId +
                ", name='" + name + '\'' +
                '}';
    }
}
