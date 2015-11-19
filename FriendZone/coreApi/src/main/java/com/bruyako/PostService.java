package com.bruyako;

import com.bruyako.model.PostDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface PostService {

    void addPost(PostDto postDto);

    void deletePost(PostDto postDto);

    Set<PostDto> getAllPostsForContact(Long contactId);

    PostDto getById(Long postId);
}
