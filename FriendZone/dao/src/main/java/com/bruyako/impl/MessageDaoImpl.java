package com.bruyako.impl;

import com.bruyako.dao.MessageDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Message;
import org.springframework.stereotype.Repository;

import java.security.SecureRandom;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class MessageDaoImpl implements MessageDao {

    private Map<String, Message> messagesMap = new HashMap<>();

    Message message = new Message();

    @Override
    public Collection<Message> getConversation(Contact firstContact, Contact secondContact) {
        return null;
    }

    @Override
    public void storeMessage(Message message) {

    }

    @Override
    public void create(Message message) {

    }

    @Override
    public void delete(Message message) {

    }

    @Override
    public Message update(String s) {
        return null;
    }

    @Override
    public Message get(String s) {
        return null;
    }

}
