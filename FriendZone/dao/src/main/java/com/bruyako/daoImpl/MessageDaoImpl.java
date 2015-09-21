package com.bruyako.daoImpl;

import com.bruyako.daoService.MessageDaoService;
import com.bruyako.model.Contact;
import com.bruyako.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */

@Service
public class MessageDaoImpl implements MessageDaoService {
    @Override
    public void storeMessage(Message message) {

    }

    @Override
    public List<Message> getConversation(Contact firstContact, Contact secondContact) {
        return null;
    }
}
