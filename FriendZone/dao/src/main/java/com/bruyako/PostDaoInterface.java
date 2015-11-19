package com.bruyako;

import com.bruyako.model.PostDto;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface PostDaoInterface extends AbstractDao<PostDto, Long> {

    Set<PostDto> getAllPostsForContact(Long contactId);

}
