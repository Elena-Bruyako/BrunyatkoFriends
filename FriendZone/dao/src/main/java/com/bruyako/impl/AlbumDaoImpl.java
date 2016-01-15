package com.bruyako.impl;

import com.bruyako.AlbumDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.Album;
import com.bruyako.entity.Contact;
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

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Set<Album> albums = contact.getAlbums();

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
    public void delete(Long albumId) {

        Album album = new Album();
        album.setAlbumId(albumId);
        sessionFactory.getCurrentSession().delete(album);
    }

    @Override
    public AlbumDto getById(Long albumId) {

        Album album = (Album) sessionFactory.getCurrentSession().get(Album.class, albumId);
        return EntityDtoConverter.convert(album);
    }
}
