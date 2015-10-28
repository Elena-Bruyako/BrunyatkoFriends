package com.bruyako.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by brunyatko on 07.09.15.
 */
@Entity
@Table(name = "MESSAGE")
public class Message implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "MESSAGE_TIME")
    private LocalDateTime date;

    @Column(name = "MESSAGE_FROM")
    private Contact from;

    @Column(name = "MESSAGE_TO")
    private Contact to;

    @Column(name = "CONTENT")
    private String content;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "conversation")
    private List<Contact> conversation = new LinkedList<>();

    public Message() {
    }

    public Message(LocalDateTime date, Contact from, Contact to, String content) {
        this.date = date;
        this.from = from;
        this.to = to;
        this.content = content;
    }

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

    public Contact getFrom() {
        return from;
    }

    public void setFrom(Contact from) {
        this.from = from;
    }

    public Contact getTo() {
        return to;
    }

    public void setTo(Contact to) {
        this.to = to;
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

        if (content != null ? !content.equals(message.content) : message.content != null) return false;
        if (conversation != null ? !conversation.equals(message.conversation) : message.conversation != null)
            return false;
        if (date != null ? !date.equals(message.date) : message.date != null) return false;
        if (from != null ? !from.equals(message.from) : message.from != null) return false;
        if (id != null ? !id.equals(message.id) : message.id != null) return false;
        if (to != null ? !to.equals(message.to) : message.to != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (conversation != null ? conversation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", date=" + date +
                ", from=" + from +
                ", to=" + to +
                ", content='" + content + '\'' +
                '}';
    }
}
