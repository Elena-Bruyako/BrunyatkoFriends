package com.bruyako.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
public class PlaceDto implements Serializable{

    private Long id;
    private String title;
    private double longitude;
    private double latitude;
    private String description;
    private Set<ContactDto> placesOfContact = new HashSet<>();

    public PlaceDto() {
    }

    public PlaceDto(String description, String title) {
        this.description = description;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Set<ContactDto> getPlacesOfContact() {
        return placesOfContact;
    }

    public void setPlacesOfContact(Set<ContactDto> placesOfContact) {
        this.placesOfContact = placesOfContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaceDto place = (PlaceDto) o;

        if (Double.compare(place.latitude, latitude) != 0) return false;
        if (Double.compare(place.longitude, longitude) != 0) return false;
        if (description != null ? !description.equals(place.description) : place.description != null) return false;
        if (id != null ? !id.equals(place.id) : place.id != null) return false;
        if (placesOfContact != null ? !placesOfContact.equals(place.placesOfContact) : place.placesOfContact != null)
            return false;
        if (title != null ? !title.equals(place.title) : place.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (placesOfContact != null ? placesOfContact.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", description='" + description + '\'' +
                '}';
    }
}
