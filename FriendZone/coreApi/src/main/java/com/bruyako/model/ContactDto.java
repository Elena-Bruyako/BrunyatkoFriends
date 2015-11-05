package com.bruyako.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
public class ContactDto implements Serializable{

    private long contactId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Set<HobbyDto> hobbies;
    private Set<PlaceDto> places;
    private Set<PostDto> posts;
    private List<MessageDto> conversation;
    private List<ContactDto> friends;

    public ContactDto() {
    }

    public ContactDto(String firstName, String lastName, LocalDate birthDate) {
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

    public List<ContactDto> getFriends() {
        return friends;
    }

    public void setFriends(List<ContactDto> friends) {
        this.friends = friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactDto contact = (ContactDto) o;

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
