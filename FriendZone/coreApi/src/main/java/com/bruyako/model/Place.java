package com.bruyako.model;

/**
 * Created by brunyatko on 07.09.15.
 */
public class Place {

    private static int placeId;
    private static String title;
    private static double longitude;
    private static double latitude;
    private static String description;

    public Place(int placeId, String title, double longitude, double latitude, String description) {

        this.placeId = placeId;
        this.title = title;
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
    }

    public static int getPlaceId() {
        return placeId;
    }

    public static void setPlaceId(int placeId) {
        Place.placeId = placeId;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Place.title = title;
    }

    public static double getLongitude() {
        return longitude;
    }

    public static void setLongitude(double longitude) {
        Place.longitude = longitude;
    }

    public static double getLatitude() {
        return latitude;
    }

    public static void setLatitude(double latitude) {
        Place.latitude = latitude;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Place.description = description;
    }
}
