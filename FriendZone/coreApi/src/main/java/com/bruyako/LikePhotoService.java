package com.bruyako;

import com.bruyako.model.LikePhotoDto;
import com.bruyako.model.LikePostDto;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface LikePhotoService {

    void saveLikePhoto(LikePhotoDto likePhotoDto);

    int getCountLikePhoto(Long likePhotoId);

    boolean isLikePhoto(Long id, Long contactId);
}
