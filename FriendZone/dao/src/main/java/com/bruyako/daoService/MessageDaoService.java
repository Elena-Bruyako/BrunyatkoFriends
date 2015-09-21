package com.bruyako.daoService;

import com.bruyako.model.Contact;
import com.bruyako.model.Message;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface MessageDaoService {

    public void storeMessage(Message message);
    public List<Message> getConversation(Contact firstContact, Contact secondContact);
}
