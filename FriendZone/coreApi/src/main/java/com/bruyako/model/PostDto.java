package com.bruyako.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by brunyatko on 07.09.15.
 */
public class PostDto implements Serializable{

    private long postId;
    private String title;
    private String content;
    private LocalDateTime date;
    private ContactDto postOfContact;
    private LikePostDto likePostDto;

    public PostDto() {
    }

    public PostDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public ContactDto getPostOfContact() {
        return postOfContact;
    }

    public void setPostOfContact(ContactDto postOfContact) {
        this.postOfContact = postOfContact;
    }

    public LikePostDto getLikePostDto() {
        return likePostDto;
    }

    public void setLikePostDto(LikePostDto likePostDto) {
        this.likePostDto = likePostDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       PostDto postDto = (PostDto) o;
        return Objects.equals(postId, postDto.postId) &&
                Objects.equals(title, postDto.title) &&
                Objects.equals(content, postDto.content) &&
                Objects.equals(date, postDto.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(postId, title, content, date);
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
