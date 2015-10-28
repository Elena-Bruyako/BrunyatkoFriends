package com.bruyako.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
@Entity
@Table(name = "CONTACT")
public class Contact implements Serializable{

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

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "CONTACT_POST", joinColumns = @JoinColumn(name = "CONTACT_ID"), inverseJoinColumns = @JoinColumn(name = "POST_ID"))
    private Set<Post> posts;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "MESSAGE", joinColumns = @JoinColumn(name = "CONTACT_FROM_ID"), inverseJoinColumns = @JoinColumn(name = "CONTACT_TO_ID"))
    private List<Message> conversation;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "CONTACT_FRIENDSHIP", joinColumns = @JoinColumn(name = "CONTACT_ID"), inverseJoinColumns = @JoinColumn(name = "FRIEND_ID"))
    private List<Contact> friends;

    public Contact() {
    }

    public Contact(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

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

    public List<Contact> getFriends() {
        return friends;
    }

    public void setFriends(List<Contact> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (contactId != contact.contactId) return false;
        if (birthDate != null ? !birthDate.equals(contact.birthDate) : contact.birthDate != null) return false;
        if (conversation != null ? !conversation.equals(contact.conversation) : contact.conversation != null)
            return false;
        if (firstName != null ? !firstName.equals(contact.firstName) : contact.firstName != null) return false;
        if (friends != null ? !friends.equals(contact.friends) : contact.friends != null) return false;
        if (hobbies != null ? !hobbies.equals(contact.hobbies) : contact.hobbies != null) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        if (places != null ? !places.equals(contact.places) : contact.places != null) return false;
        if (posts != null ? !posts.equals(contact.posts) : contact.posts != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (contactId ^ (contactId >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (hobbies != null ? hobbies.hashCode() : 0);
        result = 31 * result + (places != null ? places.hashCode() : 0);
        result = 31 * result + (posts != null ? posts.hashCode() : 0);
        result = 31 * result + (conversation != null ? conversation.hashCode() : 0);
        result = 31 * result + (friends != null ? friends.hashCode() : 0);
        return result;
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
