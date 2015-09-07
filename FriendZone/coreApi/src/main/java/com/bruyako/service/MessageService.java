package com.bruyako.service;

import com.bruyako.model.Contact;
import com.bruyako.model.Message;

import java.util.List;

/**
 * Created by brunyatko on 07.09.15.
 */
public interface MessageService {

    public void storeMessage(Message message);
    public void editMessage(Message message);
    public int countMessage(Message message);
    public List<Message> getConversation(Contact firstContact, Contact secondContact);
}
