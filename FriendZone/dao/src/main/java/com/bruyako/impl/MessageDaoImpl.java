package com.bruyako.impl;

import com.bruyako.dao.MessageDao;
import com.bruyako.model.Message;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */

@Service
public class MessageDaoImpl implements MessageDao {

    @Override
    public Collection<Message> getConversation() {
        return null;
    }

    @Override
    public void add(Message message) {

    }

    @Override
    public void create(Message message) {

    }

    @Override
    public void edit(Message message) {

    }

    @Override
    public Message get(String s) {
        return null;
    }

    @Override
    public void remove(String s) {

    }

    @Override
    public Message update(Message message) {
        return null;
    }
}
