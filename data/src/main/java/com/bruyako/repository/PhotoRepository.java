package com.bruyako.repository;

import com.bruyako.entity.Photo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by brunyatko on 10.11.15.
 */
@Repository
public class PhotoRepository implements BaseRepository <Photo, Long> {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void create(Photo photo) {
        getSession().save(photo);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete from Photo p where p.Photo_id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void update(Photo photo) {
        getSession().saveOrUpdate(photo);
    }

    @Override
    public Photo getById(Long id) {
        Photo photo = (Photo) getSession()
                .createQuery("select p.Photo_id from Photo p where p.Photo_id = :id")
                .setParameter("id", id);
        return photo;
    }

    @Override
    public List<Photo> getAll() {
        List<Photo> photos = getSession().createQuery("from Photo").list();
        return photos;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
