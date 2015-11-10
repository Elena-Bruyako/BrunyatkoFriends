package com.bruyako.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by brunyatko on 10.11.15.
 */
public class LikePostDto implements Serializable {

    private Long likePostId;
    private Long contactId;
    private Long postId;

    public LikePostDto() {
    }

    public LikePostDto(Long likePostId, Long contactId, Long postId) {
        this.likePostId = likePostId;
        this.contactId = contactId;
        this.postId = postId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LikePostDto likePostDto = (LikePostDto) o;

        return Objects.equals(likePostDto, likePostDto.likePostId) &&
                Objects.equals(contactId, likePostDto.contactId) &&
                Objects.equals(postId, likePostDto.postId);

    }

    @Override
    public int hashCode() {
        return Objects.hash(likePostId);
    }

    @Override
    public String toString() {
        return "LikePostDto{" +
                "likePostId=" + likePostId +
                ", contactId=" + contactId +
                ", postId=" + postId +
                '}';
    }
}
