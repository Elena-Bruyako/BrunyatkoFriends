package com.bruyako.impl;

import com.bruyako.dao.PostDao;
import com.bruyako.model.Post;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PostDaoImpl implements PostDao {

    private Map<String, Post> postsMap = new HashMap<>();

    Post post = new Post();

    @Override
    public Collection<Post> getAllPostsForContact(Post post) {
        return null;
    }

    @Override
    public void create(Post post) {
        postsMap.put(post.getTitle(), post);
    }

    @Override
    public void delete(Post post) {
        postsMap.remove(post);
    }

    @Override
    public Post update(String s) {
        return null;
    }

    @Override
    public Post get(String s) {
        return postsMap.get(s);
    }
}
