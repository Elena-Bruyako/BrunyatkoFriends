package com.bruyako.impl;

import com.bruyako.ContactDao;
import com.bruyako.PostDao;
import com.bruyako.PostService;
import com.bruyako.model.ContactDto;
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
    private ContactDao contactDao;

    @Autowired
    private PostDao postDao;

    @Override
    public PostDto addPost(String title, String content) {

        PostDto post = new PostDto(title, content);
        postDao.create(post);

        return post;
    }

    @Override
    public void setPostToContact(ContactDto contactDto, PostDto postDto) {

        contactDao.addPostToContact(contactDto, postDto);
    }

    @Override
    public Set<PostDto> getAllPostsForContact(ContactDto contactDto) {
        return postDao.getAllPostsForContact(contactDto);
    }
}
