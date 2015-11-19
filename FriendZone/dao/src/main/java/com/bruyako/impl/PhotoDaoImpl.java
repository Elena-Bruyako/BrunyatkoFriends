package com.bruyako.impl;

import com.bruyako.PhotoDaoInterface;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.PhotoDao;
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
public class PhotoDaoImpl implements PhotoDaoInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<PhotoDto> getAllPhotosFotContact(Long contactId) {

        List<PhotoDao> photos = sessionFactory.getCurrentSession().createSQLQuery("select p.Img from Photo p join Contact c " +
                "on p.Contact_id = c.Contact_id where c.Contact_id = :id").setResultTransformer(Transformers.aliasToBean(PhotoDao.class)).setParameter("id", contactId).list();

        Set<PhotoDto> result = new HashSet<>(photos.size());

        for (PhotoDao photo : photos) {

            result.add(EntityDtoConverter.convert(photo));
        }

        return result;
    }

    @Transactional(readOnly = false)
    @Override
    public void add(PhotoDto photoDto) {
        PhotoDao photo = EntityDtoConverter.convert(photoDto);
        sessionFactory.getCurrentSession().save(photo);
    }

    @Override
    public void delete(PhotoDto photoDto) {

        PhotoDao photo = EntityDtoConverter.convert(photoDto);
        sessionFactory.getCurrentSession().delete(photo);
    }

    @Override
    public PhotoDto getById(Long photoId) {

        List<PhotoDao> photoList = sessionFactory.getCurrentSession().createSQLQuery("select p from Photo p where p.id = :id").setParameter("id", photoId).list();
        if (photoList.isEmpty()) {
            return null;
        } else {
            return EntityDtoConverter.convert(photoList.get(0));
        }
    }

}
