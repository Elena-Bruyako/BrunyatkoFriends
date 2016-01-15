package com.bruyako.impl;

import com.bruyako.PostDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.Contact;
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

        Contact contact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactId);
        Set<Post> posts = contact.getPosts();
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
    public void delete(Long postId) {

        Post post = new Post();
        post.setPostId(postId);
        sessionFactory.getCurrentSession().delete(post);
    }


    @Override
    public PostDto getById(Long postId) {

        Post post = (Post) sessionFactory.getCurrentSession().get(Post.class, postId);
        return EntityDtoConverter.convert(post);
    }
}
