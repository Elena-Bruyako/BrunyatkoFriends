package com.bruyako.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
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
    private Set<ContactDto> placesOfContact;

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
        PlaceDto placeDto = (PlaceDto) o;
        return Objects.equals(id, placeDto.id) &&
                Objects.equals(title, placeDto.title) &&
                Objects.equals(longitude, placeDto.longitude) &&
                Objects.equals(latitude, placeDto.latitude) &&
                Objects.equals(description, placeDto.description);

    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, longitude, latitude, description);
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
