package com.bruyako.impl;

import com.bruyako.PhotoDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.Contact;
import com.bruyako.entity.Photo;
import com.bruyako.model.PhotoDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Repository
public class PhotoDaoImpl implements PhotoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<PhotoDto> getAllPhotosFotContact(Long contactId) {

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);

        Set<Photo> photos = contact.getAllPhotos();
        Set<PhotoDto> result = new HashSet<>(photos.size());

        for (Photo photo : photos) {

            result.add(EntityDtoConverter.convert(photo));

        }
        return result;
    }

    @Transactional(readOnly = false)
    @Override
    public void add(PhotoDto photoDto) {
        Photo photo = EntityDtoConverter.convert(photoDto);
        sessionFactory.getCurrentSession().save(photo);
    }

    @Override
    public void delete(Long photoId) {

        Photo photo = new Photo();
        photo.setPhotoId(photoId);
        sessionFactory.getCurrentSession().delete(photo);
    }

    @Override
    public PhotoDto getById(Long photoId) {

        Photo photo = (Photo) sessionFactory.getCurrentSession().get(Photo.class, photoId);
        return EntityDtoConverter.convert(photo);
    }

}
