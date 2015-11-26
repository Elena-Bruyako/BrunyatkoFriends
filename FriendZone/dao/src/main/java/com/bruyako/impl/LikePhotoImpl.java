package com.bruyako.impl;

import com.bruyako.LikePhotoDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.model.LikePhotoDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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

        com.bruyako.entity.LikePhoto likePhoto = EntityDtoConverter.convert(likePhotoDto);
        sessionFactory.getCurrentSession().saveOrUpdate(likePhoto);
    }

    @Override
    public int getCountLike(Long photoId) {

        List<com.bruyako.entity.LikePhoto> photoList = sessionFactory.getCurrentSession().createSQLQuery("select * from LikePhoto " +
                "join Photo on LikePhoto.photo_id = Photo.photo_id " +
                "where Photo.photo_id = :id").addEntity(com.bruyako.entity.LikePhoto.class).setParameter("id", photoId).list();

        List<LikePhotoDto> result = new ArrayList<>(photoList.size());

        for (com.bruyako.entity.LikePhoto likePhoto : photoList) {

            result.add(EntityDtoConverter.convert(likePhoto));
        }

        return result.size();
    }

    @Override
    public boolean isLike(Long photoId, Long contactId) {
        return false;
    }
}
