package com.bruyako.impl;

import com.bruyako.dao.PostDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Post;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PostDaoImpl implements PostDao {

    private Map<String, Post> postsMap = new HashMap<>();
    private Post post;

    @Override
    public Set<Contact> getAllPostsForContact(Post post) {
        return null;
    }

    @Override
    public void create(Post post) {
        postsMap.put(post.getTitle(), post);
    }

    @Override
    public void delete(Post post) {

    }

    @Override
    public void update(Post post) {

    }

    @Override
    public List<Post> getAll() {
        return null;
    }

    @Override
    public Post getById(Long id) {
        return null;
    }

}
