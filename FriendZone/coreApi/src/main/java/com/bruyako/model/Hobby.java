package com.bruyako.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
@Entity
@Table(name = "HOBBY")
public class Hobby implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "hobbies")
    private Set<Contact> hobbiesOfContact = new HashSet<>();

    public Hobby() {
    }

    public Hobby(String title, String description) {
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
        if (hobbiesOfContact != null ? !hobbiesOfContact.equals(hobby.hobbiesOfContact) : hobby.hobbiesOfContact != null)
            return false;
        if (id != null ? !id.equals(hobby.id) : hobby.id != null) return false;
        if (title != null ? !title.equals(hobby.title) : hobby.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (hobbiesOfContact != null ? hobbiesOfContact.hashCode() : 0);
        return result;
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
