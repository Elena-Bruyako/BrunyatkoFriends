package com.bruyako.impl;

import com.bruyako.PostDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.Post;
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
public class PostDaoImpl implements PostDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<PostDto> getAllPostsForContact(Long contactId) {

        List<Post> posts = sessionFactory.getCurrentSession().createSQLQuery("select p.title, p.content from Post p join Contact c on p.contact_id = c.contact_id " +
                " where c.contact_id = :contactId").setResultTransformer(Transformers.aliasToBean(Post.class)).setParameter("contactId", contactId).list();
        Set<PostDto> result = new HashSet<>(posts.size());

        for (Post post : posts) {

            result.add(EntityDtoConverter.convert(post));
        }
        return result;
    }

    @Transactional(readOnly = false)
    @Override
    public void add(PostDto postDto) {

        Post post = EntityDtoConverter.convert(postDto);
        sessionFactory.getCurrentSession().save(post);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(PostDto postDto) {

        Post post = EntityDtoConverter.convert(postDto);
        sessionFactory.getCurrentSession().delete(post);
    }


    @Override
    public PostDto getById(Long postId) {

        List<Post> posts = sessionFactory.getCurrentSession().createQuery("select p from Post p where p.id = :id").setParameter("id", postId).list();
        if (posts.isEmpty()) {
            return null;
        } else {
            return EntityDtoConverter.convert(posts.get(0));
        }
    }
}
