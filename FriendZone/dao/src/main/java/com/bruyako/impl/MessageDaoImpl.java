package com.bruyako.impl;

import com.bruyako.dao.MessageDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Message;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class MessageDaoImpl implements MessageDao {


    @Override
    public Collection<Message> getConversation(Contact firstContact, Contact secondContact) {
        return null;
    }

    @Override
    public void storeMessage(Message message) {

    }
}
