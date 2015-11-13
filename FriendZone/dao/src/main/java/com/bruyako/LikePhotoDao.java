package com.bruyako;

import com.bruyako.model.LikePhotoDto;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface LikePhotoDao{

    void saveLikePhoto (LikePhotoDto likePhotoDto);

    int getCountLike (Long photoId);

    boolean isLike (Long photoId, Long contactId);

}
