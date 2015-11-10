package com.bruyako.impl;

import com.bruyako.PhotoDao;
import com.bruyako.entity.Photo;
import com.bruyako.model.ContactDto;
import com.bruyako.model.PhotoDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

import static com.bruyako.converters.EntityDtoConverter.convert;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Repository
public class PhotoDaoImpl implements PhotoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<PhotoDto> getAllPhotosFotContact(ContactDto contactDto) {
        return null;
    }

    @Transactional(readOnly = false)
    @Override
    public void save(PhotoDto photoDto) {

        Photo photo = convert(photoDto);
        sessionFactory.getCurrentSession().save(photo);
    }

    @Override
    public void delete(PhotoDto photoDto) {

        Photo photo = convert(photoDto);
        sessionFactory.getCurrentSession().delete(photo);
    }

}
