package com.bruyako.dao;

import com.bruyako.model.Contact;
import com.bruyako.model.Message;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface MessageDao{

    List<Message> getConversation(Contact from, Contact to);

    void storeMessage(Message message);

}
