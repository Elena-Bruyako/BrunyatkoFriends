package com.bruyako.dao;

import com.bruyako.model.Message;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface MessageDao{

    List<Message> getConversation(Long contactFrom, Long contactTo);

    void storeMessage(Message message);

}
