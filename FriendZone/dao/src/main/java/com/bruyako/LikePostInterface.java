package com.bruyako;

import com.bruyako.model.LikePostDto;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface LikePostInterface {

    void saveLikePost (LikePostDto likePostDto);

    int getCountLike (Long postId);

    boolean isLike (Long postId, Long contactId);

}
