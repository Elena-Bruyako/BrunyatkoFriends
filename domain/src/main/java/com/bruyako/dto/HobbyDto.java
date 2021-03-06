package com.bruyako.dto;

import java.util.Objects;

/**
 * Created by brunyatko on 07.09.15.
 */
public class HobbyDto {

    private long hobbyId;
    private String title;
    private String description;

    public long getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(long hobbyId) {
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
        HobbyDto hobbyDto = (HobbyDto) o;
        return Objects.equals(hobbyId, hobbyDto.hobbyId) &&
                Objects.equals(title, hobbyDto.title) &&
                Objects.equals(description, hobbyDto.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(hobbyId, title, description);
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
