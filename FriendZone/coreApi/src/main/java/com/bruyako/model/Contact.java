package com.bruyako.model;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by brunyatko on 07.09.15.
 */
public class Contact {

    private static int contactId;
    private static String firstName;
    private static String lastName;
    private static LocalDate birthDate;
    private static Set<Hobby> hobbies;
    private static Set<Place> places;
    private static Set<Post> posts;

    public Contact(int contactId, String firstName, String lastName, LocalDate birthDate) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public static int getContactId() {
        return contactId;
    }

    public static void setContactId(int contactId) {
        Contact.contactId = contactId;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Contact.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Contact.lastName = lastName;
    }

    public static LocalDate getBirthDate() {
        return birthDate;
    }

    public static void setBirthDate(LocalDate birthDate) {
        Contact.birthDate = birthDate;
    }
}
