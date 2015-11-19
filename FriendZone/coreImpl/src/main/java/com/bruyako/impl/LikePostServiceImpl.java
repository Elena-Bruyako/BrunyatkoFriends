package com.bruyako.impl;

import com.bruyako.LikePostInterface;
import com.bruyako.LikePostService;
import com.bruyako.model.LikePostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Service
public class LikePostServiceImpl implements LikePostService {

    @Autowired
    private LikePostInterface likePostInterface;

    @Override
    public void saveLikePost(LikePostDto likePostDto) {
        likePostInterface.saveLikePost(likePostDto);
    }

    @Override
    public int getCountLikePost(Long postId) {
        return likePostInterface.getCountLike(postId);
    }

    @Override
    public boolean isLikePost(Long id, Long contactId) {
        return likePostInterface.isLike(id, contactId);
    }
}
