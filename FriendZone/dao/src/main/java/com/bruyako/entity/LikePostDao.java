package com.bruyako.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by brunyatko on 10.11.15.
 */
@Entity
@Table(name = "LikePost")
public class LikePostDao implements Serializable {

    @Id
    @Column(name = "LikePost_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long likePostId;

    @Column(name = "Post_id")
    private Long postId;

    @OneToOne
    @JoinColumn(name = "Post_id",  insertable = false, updatable = false)
    private PostDao post;

    public Long getLikePostId() {
        return likePostId;
    }

    public void setLikePostId(Long likePostId) {
        this.likePostId = likePostId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public PostDao getPost() {
        return post;
    }

    public void setPost(PostDao post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LikePostDao likePost = (LikePostDao) o;
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
                ", postId=" + postId +
                ", post=" + post +
                '}';
    }
}
