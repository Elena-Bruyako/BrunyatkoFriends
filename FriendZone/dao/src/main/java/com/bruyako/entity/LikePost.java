package com.bruyako.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by brunyatko on 10.11.15.
 */
@Entity
@Table(name = "LikePost")
public class LikePost implements Serializable {

    @Id
    @Column(name = "LikePost_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long likePostId;

    @Column(name = "Contact_id")
    private Long contactId;

    @Column(name = "Post_id")
    private Long postId;

    @OneToOne
    @JoinColumn(name = "Contact_id", insertable = false, updatable = false)
    private Contact contact;

    @OneToOne
    @JoinColumn(name = "Post_id",  insertable = false, updatable = false)
    private Post post;

    public Long getLikePostId() {
        return likePostId;
    }

    public void setLikePostId(Long likePostId) {
        this.likePostId = likePostId;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LikePost likePost = (LikePost) o;
        return Objects.equals(postId, likePost.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId);
    }

    @Override
    public String toString() {
        return "LikePost{" +
                "likePostId=" + likePostId +
                ", contactId=" + contactId +
                ", postId=" + postId +
                '}';
    }
}
