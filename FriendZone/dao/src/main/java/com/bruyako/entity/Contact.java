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
public class Contact implements Serializable {

    @Id
    @Column(name = "Contact_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long contactId;

    @Column(name = "Login")
    private String login;

    @Column(name = "Password")
    private String password;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Birth_Date")
    @Convert(converter = MyLocalDateConverter.class)
    private LocalDate birthDate;

    @OneToMany(mappedBy = "albumOfContact")
    private Set<Album> albums;

    @OneToMany(mappedBy = "photoForContact")
    private Set<Photo> allPhotos;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "Contact_Hobby", joinColumns = @JoinColumn(name = "Contact_id"), inverseJoinColumns = @JoinColumn(name = "Hobby_id"))
    private Set<Hobby> hobbies;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "Contact_Place", joinColumns = @JoinColumn(name = "Contact_id"), inverseJoinColumns = @JoinColumn(name = "Place_id"))
    private Set<Place> places;

    @OneToMany(mappedBy = "postOfContact")
    private Set<Post> posts;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "Message", joinColumns = @JoinColumn(name = "Contact_From_id"), inverseJoinColumns = @JoinColumn(name = "Contact_To_id"))
    private List<Message> conversation;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Contact_Friendship", joinColumns = @JoinColumn(name = "Contact_id"), inverseJoinColumns = @JoinColumn(name = "Friend_id"))
    private Set<Contact> friends;

    public Contact() {
    }

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

    public Set<Photo> getAllPhotos() {
        return allPhotos;
    }

    public void setAllPhotos(Set<Photo> allPhotos) {
        this.allPhotos = allPhotos;
    }

    public void setPhoto(Photo photo) {
        this.allPhotos.add(photo);
    }

    public Set<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public void setHobby(Hobby hobby) {
        this.hobbies.add(hobby);
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public void setPlace(Place place) {
        this.places.add(place);
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public void setPost(Post post) {
        this.posts.add(post);
    }

    public List<Message> getConversation() {
        return conversation;
    }

    public void setConversation(List<Message> conversation) {
        this.conversation = conversation;
    }

    public void setMessage(Message message) {
        this.conversation.add(message);
    }

    public Set<Contact> getFriends() {
        return friends;
    }

    public void setFriends(Set<Contact> friends) {
        this.friends = friends;
    }

    public void setFriend(Contact friend) {
        this.friends.add(friend);
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

    public void setAlbum(Album album) {
        this.albums.add(album);
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
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

