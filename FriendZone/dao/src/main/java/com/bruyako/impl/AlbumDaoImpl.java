package com.bruyako.impl;

import com.bruyako.AlbumDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.Album;
import com.bruyako.model.AlbumDto;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 19.11.15.
 */
@Transactional
@Repository
public class AlbumDaoImpl implements AlbumDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<AlbumDto> getAllAlbumForContact(Long contactId) {

        List<Album> albums = sessionFactory.getCurrentSession().createSQLQuery("select a.name from Album a join Contact c on a.contact_id = c.contact_id " +
                " where c.contact_id = :contactId").setResultTransformer(Transformers.aliasToBean(Album.class)).setParameter("contactId", contactId).list();

        Set<AlbumDto> result = new HashSet<>(albums.size());

        for (Album album : albums) {

            result.add(EntityDtoConverter.convert(album));
        }
        return result;
    }


    @Override
    public void add(AlbumDto albumDto) {

        Album album = EntityDtoConverter.convert(albumDto);
        sessionFactory.getCurrentSession().save(album);
    }

    @Override
    public void delete(AlbumDto albumDto) {

        Album album = EntityDtoConverter.convert(albumDto);
        sessionFactory.getCurrentSession().delete(album);
    }

    @Override
    public AlbumDto getById(Long albumId) {

        List<Album> albums = sessionFactory.getCurrentSession().createSQLQuery("select a from Album a where a.id = :id").setParameter("id", albumId).list();
        if (albums.isEmpty()) {
            return null;
        } else {
            return EntityDtoConverter.convert(albums.get(0));
        }
    }
}
