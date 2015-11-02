package com.bruyako.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * Created by brunyatko on 02.11.15.
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
    private Set<Contact> hobbiesOfContact;


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
        return Objects.equals(id, hobby.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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