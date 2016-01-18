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
    public void deletePost(Long postId) {

        postDao.delete(postId);
    }


    @Override
    public Set<PostDto> getAllPostsForContact(Long contactId) {

        return postDao.getAllPostsForContact(contactId);
    }

    @Override
    public Set<PostDto> getAllPost() {
        return postDao.getAllPosts();
    }

    @Override
    public PostDto getById(Long postId) {

        return postDao.getById(postId);
    }
}
