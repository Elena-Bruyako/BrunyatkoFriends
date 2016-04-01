package com.bruyako.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by brunyatko on 10.11.15.
 */
@Repository
public class LikePhotoRepository {

    @Autowired
    public SessionFactory sessionFactory;


}
