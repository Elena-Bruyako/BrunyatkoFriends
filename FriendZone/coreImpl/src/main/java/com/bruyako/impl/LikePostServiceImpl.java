package com.bruyako.impl;

import com.bruyako.LikePostDao;
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
    private LikePostDao likePostDao;

    @Override
    public void saveLikePost(LikePostDto likePostDto) {
        likePostDao.saveLikePost(likePostDto);
    }

    @Override
    public int getCountLikePost(Long postId) {
        return likePostDao.getCountLike(postId);
    }

    @Override
    public boolean isLikePost(Long id, Long contactId) {
        return likePostDao.isLike(id, contactId);
    }
}
