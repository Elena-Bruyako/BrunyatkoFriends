package com.bruyako.repository;

import com.bruyako.entity.Album;
import com.bruyako.BaseRepository;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by brunyatko on 19.11.15.
 */
@Repository
public class AlbumRepository extends BaseRepository<Album, Long> {

    @Override
    public void create(Album album) {
        getSession().save(album);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete from Album a where a.Album_id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void update(Album album) {
        getSession().saveOrUpdate(album);
    }

    @Override
    public Album getById(Long id) {
        Album album = (Album) getSession()
                .createQuery("select a.Album_id from Album a where a.Album_id = :id")
                .setParameter("id", id);
        return album;
    }

    @Override
    public List<Album> getAll() {
        List<Album> albumList = getSession().createQuery("from Album").list();
        return albumList;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
