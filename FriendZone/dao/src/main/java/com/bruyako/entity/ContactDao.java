package com.bruyako.entity;

import com.bruyako.converters.MyLocalDateConverter;

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
@Table(name = "Contact")
public class ContactDao implements Serializable {

    @Id
    @Column(name = "Contact_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long contactId;

    @Column(name = "Login", nullable = false)
    private String login;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "First_Name", nullable = false)
    private String firstName;

    @Column(name = "Last_Name", nullable = false)
    private String lastName;

    @Column(name = "Birth_Date", nullable = false)
    @Convert(converter = MyLocalDateConverter.class)
    private LocalDate birthDate;

    @OneToMany(mappedBy = "albumOfContact")
    private Set<AlbumDao> albums;

    @OneToMany(mappedBy = "photoForContact")
    private Set<PhotoDao> allPhotos;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "Contact_Hobby", joinColumns = @JoinColumn(name = "Contact_id"), inverseJoinColumns = @JoinColumn(name = "Hobby_id"))
    private Set<HobbyDao> hobbies;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "Contact_Place", joinColumns = @JoinColumn(name = "Contact_id"), inverseJoinColumns = @JoinColumn(name = "Place_id"))
    private Set<PlaceDao> places;

    @OneToMany(mappedBy = "postOfContact")
    private Set<PostDao> posts;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "Message", joinColumns = @JoinColumn(name = "Contact_From_id"), inverseJoinColumns = @JoinColumn(name = "Contact_To_id"))
    private List<MessageDao> conversation;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "Contact_Friendship", joinColumns = @JoinColumn(name = "Contact_id"), inverseJoinColumns = @JoinColumn(name = "Friend_id"))
    private Set<ContactDao> friends;

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Set<PhotoDao> getAllPhotos() {
        return allPhotos;
    }

    public void setAllPhotos(Set<PhotoDao> allPhotos) {
        this.allPhotos = allPhotos;
    }

    public Set<HobbyDao> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<HobbyDao> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<PlaceDao> getPlaces() {
        return places;
    }

    public void setPlaces(Set<PlaceDao> places) {
        this.places = places;
    }

    public Set<PostDao> getPosts() {
        return posts;
    }

    public void setPosts(Set<PostDao> posts) {
        this.posts = posts;
    }

    public List<MessageDao> getConversation() {
        return conversation;
    }

    public void setConversation(List<MessageDao> conversation) {
        this.conversation = conversation;
    }

    public Set<ContactDao> getFriends() {
        return friends;
    }

    public void setFriends(Set<ContactDao> friends) {
        this.friends = friends;
    }

    public Set<AlbumDao> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<AlbumDao> albums) {
        this.albums = albums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDao contact = (ContactDao) o;
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
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

