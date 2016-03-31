package com.bruyako.impl;

import com.bruyako.LikePhotoDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.LikePhoto;
import com.bruyako.model.LikePhotoDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Repository
public class LikePhotoImpl implements LikePhotoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveLikePhoto(LikePhotoDto likePhotoDto) {

        LikePhoto likePhoto = EntityDtoConverter.convert(likePhotoDto);
        sessionFactory.getCurrentSession().saveOrUpdate(likePhoto);
    }

    @Override
    public int getCountLike(Long photoId) {


        return 0;
    }

    @Override
    public boolean isLike(Long photoId, Long contactId) {
        return false;
    }
}
