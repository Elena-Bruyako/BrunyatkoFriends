package com.bruyako.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
public class ContactDto implements Serializable{

    private long contactId;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<PostDto> allPhotos;
    private LikePhotoDto likePhoto;
    private LikePostDto likePost;
    private Set<HobbyDto> hobbies;
    private Set<PlaceDto> places;
    private Set<PostDto> posts;
    private List<MessageDto> conversation;
    private Set<ContactDto> friends;

    public ContactDto() {
    }

    public ContactDto(String login, String password, String firstName, String lastName, LocalDate birthDate) {
        this.login = login;
        this.password = password;
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

    public Set<PostDto> getAllPhotos() {
        return allPhotos;
    }

    public void setAllPhotos(Set<PostDto> allPhotos) {
        this.allPhotos = allPhotos;
    }

    public LikePhotoDto getLikePhoto() {
        return likePhoto;
    }

    public void setLikePhoto(LikePhotoDto likePhoto) {
        this.likePhoto = likePhoto;
    }

    public LikePostDto getLikePost() {
        return likePost;
    }

    public void setLikePost(LikePostDto likePost) {
        this.likePost = likePost;
    }

    public Set<HobbyDto> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<HobbyDto> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<PlaceDto> getPlaces() {
        return places;
    }

    public void setPlaces(Set<PlaceDto> places) {
        this.places = places;
    }

    public Set<PostDto> getPosts() {
        return posts;
    }

    public void setPosts(Set<PostDto> posts) {
        this.posts = posts;
    }

    public List<MessageDto> getConversation() {
        return conversation;
    }

    public void setConversation(List<MessageDto> conversation) {
        this.conversation = conversation;
    }

    public Set<ContactDto> getFriends() {
        return friends;
    }

    public void setFriends(Set<ContactDto> friends) {
        this.friends = friends;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDto contactDto = (ContactDto) o;
        return Objects.equals(contactId, contactDto.contactId) &&
                Objects.equals(login, contactDto.login) &&
                Objects.equals(password, contactDto.password) &&
                Objects.equals(firstName, contactDto.firstName) &&
                Objects.equals(lastName, contactDto.lastName) &&
                Objects.equals(birthDate, contactDto.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactId,  login, password, firstName, lastName, birthDate);
    }

    @Override
    public String toString() {
        return "ContactDto{" +
                "contactId=" + contactId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
