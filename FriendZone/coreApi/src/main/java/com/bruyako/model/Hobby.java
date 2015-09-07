package com.bruyako.model;

/**
 * Created by brunyatko on 07.09.15.
 */
public class Hobby {

    private static int hobbyId;
    private static String title;
    private static String description;

    public Hobby(int hobbyId, String title, String description) {

        this.hobbyId = hobbyId;
        this.title = title;
        this.description = description;
    }

    public static int getHobbyId() {
        return hobbyId;
    }

    public static void setHobbyId(int hobbyId) {
        Hobby.hobbyId = hobbyId;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Hobby.title = title;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Hobby.description = description;
    }
}
