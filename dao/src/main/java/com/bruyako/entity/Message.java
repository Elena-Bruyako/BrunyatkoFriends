package com.bruyako.entity;

import com.bruyako.converters.MyLocalDateTimeToTimestampConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
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
    private long messageId;

    @Column(name = "Message_Time")
    @Convert(converter = MyLocalDateTimeToTimestampConverter.class)
    private LocalDateTime date;

    @Column(name = "Contact_From_id")
    private long contactFromId;

    @Column(name = "Contact_To_id")
    private long contactToId;

    @Column(name = "Content")
    private String content;

    public Message() {
    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public long getContactFromId() {
        return contactFromId;
    }

    public void setContactFromId(long contactFromId) {
        this.contactFromId = contactFromId;
    }

    public long getContactToId() {
        return contactToId;
    }

    public void setContactToId(long contactToId) {
        this.contactToId = contactToId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(messageId, message.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId);
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", date=" + date +
                ", contactFromId=" + contactFromId +
                ", contactToId=" + contactToId +
                ", content='" + content + '\'' +
                '}';
    }
}
