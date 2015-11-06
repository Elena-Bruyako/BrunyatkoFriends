package com.bruyako.entity;

import com.bruyako.converters.MyLocalDateTimeToTimestampConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Created by brunyatko on 02.11.15.
 */
@Entity
@Table(name = "Message")
public class Message implements Serializable {

    @Id
    @Column(name = "Message_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Message_Time")
    @Convert(converter = MyLocalDateTimeToTimestampConverter.class)
    private LocalDateTime date;

    @Column(name = "Contact_From_id")
    private Long contactFromId;

    @Column(name = "Contact_To_id")
    private Long contactToId;

    @Column(name = "Content")
    private String content;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "conversation")
    private List<Contact> conversation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Long getContactFromId() {
        return contactFromId;
    }

    public void setContactFromId(Long contactFromId) {
        this.contactFromId = contactFromId;
    }

    public Long getContactToId() {
        return contactToId;
    }

    public void setContactToId(Long contactToId) {
        this.contactToId = contactToId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Contact> getConversation() {
        return conversation;
    }

    public void setConversation(List<Contact> conversation) {
        this.conversation = conversation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", date=" + date +
                ", contactFromId=" + contactFromId +
                ", contactToId=" + contactToId +
                ", content='" + content + '\'' +
                '}';
    }
}
