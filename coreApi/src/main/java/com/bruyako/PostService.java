package com.bruyako;

import com.bruyako.model.PostDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface PostService {

    void addPost(PostDto postDto);

    void deletePost(Long postId);

    Set<PostDto> getAllPostsForContact(Long contactId);

    Set<PostDto> getAllPost();

    PostDto getById(Long postId);
}
