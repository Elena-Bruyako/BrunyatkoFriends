package com.bruyako.model;

import java.time.LocalDateTime;

/**
 * Created by brunyatko on 07.09.15.
 */
public class Message {

    private static int messageId;
    private static LocalDateTime date;
    private static Contact from;
    private static Contact to;
    private static String content;

    public Message(int messageId, LocalDateTime date, Contact from, Contact to, String content) {

        this.messageId = messageId;
        this.date = date;
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public static int getMessageId() {
        return messageId;
    }

    public static void setMessageId(int messageId) {
        Message.messageId = messageId;
    }

    public static LocalDateTime getDate() {
        return date;
    }

    public static void setDate(LocalDateTime date) {
        Message.date = date;
    }

    public static Contact getFrom() {
        return from;
    }

    public static void setFrom(Contact from) {
        Message.from = from;
    }

    public static Contact getTo() {
        return to;
    }

    public static void setTo(Contact to) {
        Message.to = to;
    }

    public static String getContent() {
        return content;
    }

    public static void setContent(String content) {
        Message.content = content;
    }
}
