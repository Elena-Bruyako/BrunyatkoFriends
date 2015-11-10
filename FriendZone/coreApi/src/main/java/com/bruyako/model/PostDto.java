package com.bruyako.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by brunyatko on 07.09.15.
 */
public class PostDto implements Serializable{

    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return Objects.equals(id, postDto.id) &&
                Objects.equals(title, postDto.title) &&
                Objects.equals(content, postDto.content) &&
                Objects.equals(date, postDto.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, content, date);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
