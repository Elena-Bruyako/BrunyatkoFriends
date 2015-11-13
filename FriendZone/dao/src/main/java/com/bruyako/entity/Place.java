package com.bruyako.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by brunyatko on 02.11.15.
 */
@Entity
@Table(name = "Place")
public class Place implements Serializable {

    @Id
    @Column(name = "Place_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long placeId;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "Longitude")
    private double longitude;

    @Column(name = "Latitude")
    private double latitude;

    @Column(name = "Description", nullable = false)
    private String description;

    public long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(long placeId) {
        this.placeId = placeId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(placeId, place.placeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeId);
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeId=" + placeId +
                ", title='" + title + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", description='" + description + '\'' +
                '}';
    }
}