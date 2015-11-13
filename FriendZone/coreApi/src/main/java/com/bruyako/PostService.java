package com.bruyako;

import com.bruyako.model.ContactDto;
import com.bruyako.model.PostDto;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface PostService {

    PostDto addPost(String title, String content);

    void setPostToContact(ContactDto contactDto, PostDto postDto);

    Set<PostDto> getAllPostsForContact(Long contactId);
}
