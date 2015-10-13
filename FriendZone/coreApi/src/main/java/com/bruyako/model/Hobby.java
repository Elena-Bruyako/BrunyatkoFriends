package com.bruyako.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
public class Hobby implements Serializable {

    private String title;
    private String description;
    private Set<Contact> hobbiesOfContact = new HashSet<>();

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

    public Set<Contact> getHobbiesOfContact() {
        return hobbiesOfContact;
    }

    public void setHobbiesOfContact(Set<Contact> hobbiesOfContact) {
        this.hobbiesOfContact = hobbiesOfContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hobby hobby = (Hobby) o;

        if (description != null ? !description.equals(hobby.description) : hobby.description != null) return false;
        if (title != null ? !title.equals(hobby.title) : hobby.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
