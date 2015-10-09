package com.bruyako.impl;

import com.bruyako.dao.PostDao;
import com.bruyako.model.Post;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PostDaoImpl implements PostDao {

    private Map<String, Post> postsMap = new HashMap<>();
    private Post post;

    @Override
    public List<Post> getAllPostsForContact(Post post) {
        return null;
    }

    @Override
    public void create(Post post) {
        postsMap.put(post.getTitle(), post);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Post post) {

    }

    @Override
    public List<Post> getAll() {
        return null;
    }

}
