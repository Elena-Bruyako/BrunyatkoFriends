package com.bruyako.dto;

import java.util.Objects;

/**
 * Created by brunyatko on 10.11.15.
 */
public class LikePostDto {

    private Long likePostId;
    private Long postId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LikePostDto likePostDto = (LikePostDto) o;

        return Objects.equals(likePostDto, likePostDto.likePostId) &&
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
                ", postId=" + postId +
                '}';
    }
}
