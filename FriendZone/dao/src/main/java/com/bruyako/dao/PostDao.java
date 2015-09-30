package com.bruyako.dao;

import com.bruyako.model.Post;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public interface PostDao extends AbstractDao<Post, String> {

    Collection<Post> getAllPostForContact();

}
