package com.bruyako.entity;

import com.bruyako.converters.MyLocalDateTimeToTimestampConverter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Created by brunyatko on 02.11.15.
 */
@Entity
@Table(name = "Post")
public class PostDao implements Serializable {

    @Id
    @Column(name = "Post_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long postId;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "Content", nullable = false)
    private String content;

    @Column(name = "Date_Post")
    @Convert(converter = MyLocalDateTimeToTimestampConverter.class)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "Contact_id")
    private ContactDao postOfContact;

    @OneToOne(mappedBy="post")
    @Cascade(value=org.hibernate.annotations.CascadeType.ALL)
    private LikePostDao likePost;

    public PostDao() {
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

    public ContactDao getPostOfContact() {
        return postOfContact;
    }

    public void setPostOfContact(ContactDao postOfContact) {
        this.postOfContact = postOfContact;
    }

    public LikePostDao getLikePost() {
        return likePost;
    }

    public void setLikePost(LikePostDao likePost) {
        this.likePost = likePost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostDao post = (PostDao) o;
        return Objects.equals(postId, post.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId);
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
