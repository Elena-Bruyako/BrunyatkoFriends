package com.bruyako.model;

import java.time.LocalDate;

/**
 * Created by brunyatko on 07.09.15.
 */
public class Post {

    private static int postId;
    private static String content;
    private static LocalDate date;

    public Post(int postId,  String content, LocalDate date) {

        this.postId = postId;
        this.content = content;
        this.date = date;
    }

    public static int getPostId() {
        return postId;
    }

    public static void setPostId(int postId) {
        Post.postId = postId;
    }

    public static String getContent() {
        return content;
    }

    public static void setContent(String content) {
        Post.content = content;
    }

    public static LocalDate getDate() {
        return date;
    }

    public static void setDate(LocalDate date) {
        Post.date = date;
    }
}
