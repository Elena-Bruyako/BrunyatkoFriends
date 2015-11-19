package com.bruyako.impl;

import com.bruyako.PostDaoInterface;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.PostDao;
import com.bruyako.model.PostDto;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Transactional
@Repository
public class PostDaoImpl implements PostDaoInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<PostDto> getAllPostsForContact(Long contactId) {

        List<PostDao> posts = sessionFactory.getCurrentSession().createSQLQuery("select p.title, p.content from Post p join Contact c on p.contact_id = c.contact_id " +
                " where c.contact_id = :contactId").setResultTransformer(Transformers.aliasToBean(PostDao.class)).setParameter("contactId", contactId).list();
        Set<PostDto> result = new HashSet<>(posts.size());

        for (PostDao post : posts) {

            result.add(EntityDtoConverter.convert(post));
        }
        return result;
    }

    @Transactional(readOnly = false)
    @Override
    public void add(PostDto postDto) {

        PostDao post = EntityDtoConverter.convert(postDto);
        sessionFactory.getCurrentSession().save(post);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(PostDto postDto) {

        PostDao post = EntityDtoConverter.convert(postDto);
        sessionFactory.getCurrentSession().delete(post);
    }


    @Override
    public PostDto getById(Long postId) {

        List<PostDao> posts = sessionFactory.getCurrentSession().createSQLQuery("select p from Post p where p.id = :id").setParameter("id", postId).list();
        if (posts.isEmpty()) {
            return null;
        } else {
            return EntityDtoConverter.convert(posts.get(0));
        }
    }
}
