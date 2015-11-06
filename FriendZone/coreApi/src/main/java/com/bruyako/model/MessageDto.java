package com.bruyako.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Created by brunyatko on 07.09.15.
 */
public class MessageDto implements Serializable {

    private Long id;
    private LocalDateTime date;
    private Long contactFromId;
    private Long contactToId;
    private String content;
    private List<ContactDto> conversation;

    public MessageDto() {
    }

    public MessageDto(LocalDateTime date, Long contactFromId, Long contactToId, String content) {
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
       MessageDto messageDto = (MessageDto) o;
        return Objects.equals(id, messageDto.id) &&
                Objects.equals(date, messageDto.date) &&
                Objects.equals(contactFromId, messageDto.contactFromId) &&
                Objects.equals(contactToId, messageDto.contactToId) &&
                Objects.equals(content, messageDto.content);

    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, contactFromId, contactToId, content);
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
