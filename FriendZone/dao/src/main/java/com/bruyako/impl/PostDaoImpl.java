package com.bruyako.impl;

import com.bruyako.dao.PostDao;
import com.bruyako.model.Post;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class PostDaoImpl implements PostDao {

    @Override
    public Collection<Post> getAllPostForContact() {
        return null;
    }

    @Override
    public void add(Post post) {

    }

    @Override
    public void edit(Post post) {

    }

    @Override
    public Post get(String s) {
        return null;
    }

    @Override
    public void remove(Post post) {

    }

    @Override
    public Post update(Post post) {
        return null;
    }
}
