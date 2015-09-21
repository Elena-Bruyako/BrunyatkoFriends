package com.bruyako.daoService;

import com.bruyako.model.Post;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface PostDaoService {

    public void addPost(Post post);
    public List<Post> getAllPostFotContact(Post post);

}
