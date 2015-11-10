package com.bruyako.impl;

import com.bruyako.LikePhotoDao;
import com.bruyako.LikePostDao;
import com.bruyako.LikePhotoService;
import com.bruyako.model.LikePhotoDto;
import com.bruyako.model.LikePostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Service
public class LikePhotoServiceImpl implements LikePhotoService {

    @Autowired
    private LikePhotoDao likePhotoDao;

    @Override
    public void saveLikePhoto(LikePhotoDto likePhotoDto) {
        likePhotoDao.saveLikePhoto(likePhotoDto);
    }

    @Override
    public int getCountLikePhoto(Long likePhotoId) {
        return likePhotoDao.getCountLike(likePhotoId);
    }

    @Override
    public boolean isLikePhoto(Long id, Long contactId) {
        return likePhotoDao.isLike(id, contactId);
    }
}
