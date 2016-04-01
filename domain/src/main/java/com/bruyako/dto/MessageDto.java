package com.bruyako.dto;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by brunyatko on 07.09.15.
 */
public class MessageDto {

    private long messageId;
    private LocalDateTime date;
    private long contactFromId;
    private long contactToId;
    private String content;

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
       MessageDto messageDto = (MessageDto) o;
        return Objects.equals(messageId, messageDto.messageId) &&
                Objects.equals(date, messageDto.date) &&
                Objects.equals(contactFromId, messageDto.contactFromId) &&
                Objects.equals(contactToId, messageDto.contactToId) &&
                Objects.equals(content, messageDto.content);

    }

    @Override
    public int hashCode() {

        return Objects.hash(messageId, date, contactFromId, contactToId, content);
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
