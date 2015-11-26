package com.bruyako.impl;

import com.bruyako.PostDao;
import com.bruyako.PostService;
import com.bruyako.model.PostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao postDao;

    @Override
    public void addPost(PostDto postDto) {

        postDao.add(postDto);
    }

    @Override
    public void deletePost(PostDto postDto) {

        postDao.delete(postDto);
    }


    @Override
    public Set<PostDto> getAllPostsForContact(Long contactId) {

        return postDao.getAllPostsForContact(contactId);
    }

    @Override
    public PostDto getById(Long postId) {

        return postDao.getById(postId);
    }
}
