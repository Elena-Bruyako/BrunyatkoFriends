package com.bruyako.dao;

import com.bruyako.model.Post;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface PostDao extends AbstractDao<Post> {

    List<Post> getAllPostsForContact(Post post);

}
