package com.bruyako.impl;

import com.bruyako.LikePostDao;
import com.bruyako.entity.LikePost;
import com.bruyako.model.LikePostDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import static com.bruyako.converters.EntityDtoConverter.convert;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Repository
public class LikePostImpl implements LikePostDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveLikePost(LikePostDto likePostDto) {

        LikePost likePost = convert(likePostDto);
        sessionFactory.getCurrentSession().saveOrUpdate(likePost);
    }

    @Override
    public int getCountLike(Long postId) {

        return 0;
    }

    @Override
    public boolean isLike(Long postId, Long contactId) {
        return false;
    }

}
