package com.bruyako.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * Created by brunyatko on 07.09.15.
 */
public class ContactDto{

    private long contactId;
    private String firstName;
    private String lastName;
    private String dateStr;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

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
        return LocalDate.parse(dateStr, formatter);
    }

    public void setBirthDate(LocalDate date) {
        this.dateStr = formatter.format(date);
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactDto contactDto = (ContactDto) o;
        return Objects.equals(firstName, contactDto.firstName) &&
                Objects.equals(lastName, contactDto.lastName) &&
                Objects.equals(dateStr, contactDto.dateStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateStr);
    }

    @Override
    public String toString() {
        return "ContactDto{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateStr=" + dateStr +
                '}';
    }
}
