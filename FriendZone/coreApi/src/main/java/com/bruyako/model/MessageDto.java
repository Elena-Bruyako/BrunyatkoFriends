package com.bruyako.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by brunyatko on 07.09.15.
 */
public class MessageDto implements Serializable {

    private Long id;
    private Timestamp date;
    private Long contactFromId;
    private Long contactToId;
    private String content;
    private List<ContactDto> conversation = new LinkedList<>();

    public MessageDto() {
    }

    public MessageDto(Timestamp date, Long contactFromId, Long contactToId, String content) {
        this.date = date;
        this.contactFromId = contactFromId;
        this.contactToId = contactToId;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
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

    public List<ContactDto> getConversation() {
        return conversation;
    }

    public void setConversation(List<ContactDto> conversation) {
        this.conversation = conversation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageDto message = (MessageDto) o;

        if (contactFromId != null ? !contactFromId.equals(message.contactFromId) : message.contactFromId != null)
            return false;
        if (contactToId != null ? !contactToId.equals(message.contactToId) : message.contactToId != null) return false;
        if (content != null ? !content.equals(message.content) : message.content != null) return false;
        if (conversation != null ? !conversation.equals(message.conversation) : message.conversation != null)
            return false;
        if (date != null ? !date.equals(message.date) : message.date != null) return false;
        if (id != null ? !id.equals(message.id) : message.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (contactFromId != null ? contactFromId.hashCode() : 0);
        result = 31 * result + (contactToId != null ? contactToId.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (conversation != null ? conversation.hashCode() : 0);
        return result;
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
