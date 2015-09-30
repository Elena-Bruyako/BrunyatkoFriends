package com.bruyako.dao;

import com.bruyako.model.Contact;
import com.bruyako.model.Message;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public interface MessageDao {

    Collection<Message> getConversation(Contact firstContact, Contact secondContact);
    void storeMessage(Message message);

}
