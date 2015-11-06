package com.bruyako.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
public class HobbyDto implements Serializable {

    private Long id;
    private String title;
    private String description;
    private Set<ContactDto> hobbiesOfContact;

    public HobbyDto() {
    }

    public HobbyDto(String title, String description) {
        this.title = title;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ContactDto> getHobbiesOfContact() {
        return hobbiesOfContact;
    }

    public void setHobbiesOfContact(Set<ContactDto> hobbiesOfContact) {
        this.hobbiesOfContact = hobbiesOfContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HobbyDto hobbyDto = (HobbyDto) o;
        return Objects.equals(id, hobbyDto.id) &&
                Objects.equals(title, hobbyDto.title) &&
                Objects.equals(description, hobbyDto.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, description);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
