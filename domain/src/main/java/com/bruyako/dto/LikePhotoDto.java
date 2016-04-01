package com.bruyako.dto;

import java.util.Objects;

/**
 * Created by brunyatko on 10.11.15.
 */
public class LikePhotoDto {

    private long likePhotoId;
    private long photoId;
    private PhotoDto photoDto;

    public long getLikePhotoId() {
        return likePhotoId;
    }

    public void setLikePhotoId(long likePhotoId) {
        this.likePhotoId = likePhotoId;
    }

    public long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(long photoId) {
        this.photoId = photoId;
    }

    public PhotoDto getPhotoDto() {
        return photoDto;
    }

    public void setPhotoDto(PhotoDto photoDto) {
        this.photoDto = photoDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LikePhotoDto likePhotoDto = (LikePhotoDto) o;

        return Objects.equals(likePhotoId, likePhotoDto.likePhotoId) &&
                Objects.equals(photoId, likePhotoDto.photoId);

    }

    @Override
    public int hashCode() {
        return Objects.hash(likePhotoId);
    }

    @Override
    public String toString() {
        return "LikePhotoDto{" +
                "likePhotoId=" + likePhotoId +
                ", photoId=" + photoId +
                ", photoDto=" + photoDto +
                '}';
    }
}
