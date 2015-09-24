package com.bruyako.dao;

import com.bruyako.model.Message;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface MessageDao extends AbstractDao<Message, String> {

    Collection<Message> getConversation();
}
