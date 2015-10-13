package com.bruyako.dao;

import com.bruyako.model.Contact;
import com.bruyako.model.Post;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface PostDao extends AbstractDao<Post, Long> {

    Set<Contact> getAllPostsForContact(Post post);

}
