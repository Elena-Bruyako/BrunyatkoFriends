package com.bruyako.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Created by brunyatko on 02.11.15.
 */
@Entity
@Table(name = "CONTACT")
public class Contact implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long contactId;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "CONTACT_HOBBY", joinColumns = @JoinColumn(name = "CONTACT_ID"), inverseJoinColumns = @JoinColumn(name = "HOBBY_ID"))
    private Set<Hobby> hobbies;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "CONTACT_PLACE", joinColumns = @JoinColumn(name = "CONTACT_ID"), inverseJoinColumns = @JoinColumn(name = "PLACE_ID"))
    private Set<Place> places;

    @OneToMany(mappedBy = "postOfContact")
    private Set<Post> posts;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "MESSAGE", joinColumns = @JoinColumn(name = "CONTACT_FROM_ID"), inverseJoinColumns = @JoinColumn(name = "CONTACT_TO_ID"))
    private List<Message> conversation;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "CONTACT_FRIENDSHIP", joinColumns = @JoinColumn(name = "CONTACT_ID"), inverseJoinColumns = @JoinColumn(name = "FRIEND_ID"))
    private Set<Contact> friends;

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public List<Message> getConversation() {
        return conversation;
    }

    public void setConversation(List<Message> conversation) {
        this.conversation = conversation;
    }

    public Set<Contact> getFriends() {
        return friends;
    }

    public void setFriends(Set<Contact> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(contactId, contact.contactId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

