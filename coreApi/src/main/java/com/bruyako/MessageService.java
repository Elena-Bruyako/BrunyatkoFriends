package com.bruyako;

import com.bruyako.model.ContactDto;
import com.bruyako.model.MessageDto;

import java.util.List;

/**
 * Created by brunyatko on 10.11.15.
 */
public interface MessageService {

    List<MessageDto> getConversation(ContactDto from, ContactDto to);

    void sendMessage(String content, Long from, Long to);
}
