package com.bruyako.impl;

import com.bruyako.dao.PostDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Post;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PostDaoImpl implements PostDao {

    private SessionFactory sessionFactory;

    @Override
    public Set<Contact> getAllPostsForContact(Post post) {
        return null;
    }

    @Override
    public void create(Post post) {

        sessionFactory.getCurrentSession().save(post);
    }

    @Override
    public void delete(Post post) {

        sessionFactory.getCurrentSession().delete(post);
    }

    @Override
    public List<Post> getAll() {

        return null;
    }

    @Override
    public Post getById(Long id) {

        Post post = sessionFactory.getCurrentSession().get(Post.class, id);
        return post;
    }
}
