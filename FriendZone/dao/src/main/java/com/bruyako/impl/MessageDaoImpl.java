package com.bruyako.impl;

import com.bruyako.dao.MessageDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Message;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class MessageDaoImpl implements MessageDao {

    private Map<String, Message> messagesMap = new HashMap<>();
    private Message message;

    @Override
    public List<Message> getConversation(Contact firstContact, Contact secondContact) {
        return null;
    }

    @Override
    public void storeMessage(Message message) {

    }

    @Override
    public void create(Message message) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Message message) {

    }

    @Override
    public List<Message> getAll() {
        return null;
    }

}
