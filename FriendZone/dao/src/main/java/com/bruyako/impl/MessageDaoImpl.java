package com.bruyako.impl;

import com.bruyako.dao.MessageDao;
import com.bruyako.model.Message;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class MessageDaoImpl implements MessageDao {

    private List<Message> messages = new ArrayList<>();

    @Override
    public List<Message> getConversation(Long contactFrom, Long contactTo) {


        return null;
    }

    @Override
    public void storeMessage(Message message) {
        messages.add(message);
    }

}
