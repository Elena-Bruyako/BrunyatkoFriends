package com.bruyako;

import com.bruyako.model.LikePostDto;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface LikePostService {

    void saveLikePost(LikePostDto likePostDto);

    int getCountLikePost(Long likePostId);

    boolean isLikePost(Long id, Long contactId);
}
