package com.bruyako.model;

import java.io.Serializable;

/**
 * Created by brunyatko on 07.09.15.
 */
public class Hobby implements Serializable {

    private int hobbyId;
    private String title;
    private String description;

    public int getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(int hobbyId) {
        this.hobbyId = hobbyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

        Hobby hobby = (Hobby) o;

        if (hobbyId != hobby.hobbyId) return false;
        if (description != null ? !description.equals(hobby.description) : hobby.description != null) return false;
        if (title != null ? !title.equals(hobby.title) : hobby.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hobbyId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyId=" + hobbyId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
