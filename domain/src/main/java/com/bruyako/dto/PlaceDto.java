package com.bruyako.dto;

import java.util.Objects;

/**
 * Created by brunyatko on 07.09.15.
 */
public class PlaceDto {

    private long placeId;
    private String title;
    private double longitude;
    private double latitude;
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
        PlaceDto placeDto = (PlaceDto) o;
        return Objects.equals(placeId, placeDto.placeId) &&
                Objects.equals(title, placeDto.title) &&
                Objects.equals(longitude, placeDto.longitude) &&
                Objects.equals(latitude, placeDto.latitude) &&
                Objects.equals(description, placeDto.description);

    }

    @Override
    public int hashCode() {

        return Objects.hash(placeId, title, longitude, latitude, description);
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
