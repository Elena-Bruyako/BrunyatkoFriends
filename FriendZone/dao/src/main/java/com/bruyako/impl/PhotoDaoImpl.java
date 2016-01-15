package com.bruyako.impl;

import com.bruyako.PhotoDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.Photo;
import com.bruyako.model.PhotoDto;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
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

        List<Photo> photos = sessionFactory.getCurrentSession().createSQLQuery("select p.Img from Photo p join Contact c " +
                "on p.Contact_id = c.Contact_id where c.Contact_id = :id").setResultTransformer(Transformers.aliasToBean(Photo.class)).setParameter("id", contactId).list();

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

//        Photo photo = EntityDtoConverter.convert(photoDto);
//        sessionFactory.getCurrentSession().delete(photo);
    }

    @Override
    public PhotoDto getById(Long photoId) {

        List<Photo> photoList = sessionFactory.getCurrentSession().createQuery("select p from Photo p where p.id = :id").setParameter("id", photoId).list();
        if (photoList.isEmpty()) {
            return null;
        } else {
            return EntityDtoConverter.convert(photoList.get(0));
        }
    }

}
