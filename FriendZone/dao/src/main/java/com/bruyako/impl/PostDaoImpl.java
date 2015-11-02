package com.bruyako.impl;

import com.bruyako.PostDao;
import com.bruyako.entity.Post;
import com.bruyako.model.ContactDto;
import com.bruyako.model.PostDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

import static com.bruyako.converters.EntityDtoConverter.convert;

/**
 * Created by brunyatko on 21.09.15.
 */
@Transactional
@Repository
public class PostDaoImpl implements PostDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Set<PostDto> getAllPostsForContact(ContactDto contactDto) {


        return null;
    }

    @Transactional(readOnly = false)
    @Override
    public Long create(PostDto postDto) {

        Post post = convert(postDto);
        sessionFactory.getCurrentSession().save(post);
        return post.getId();
    }

    @Override
    public void delete(PostDto postDto) {

        Post post = convert(postDto);
        sessionFactory.getCurrentSession().delete(post);
    }


    @Override
    public PostDto getById(Long id) {

        List<Post> posts = sessionFactory.getCurrentSession().createQuery("select p from Post p where p.id = :id").setParameter("id", id).list();
        if (posts.isEmpty()) {
            return null;
        } else {
            return convert(posts.get(0));
        }
    }
}
