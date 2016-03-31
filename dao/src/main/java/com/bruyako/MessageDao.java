package com.bruyako;

import com.bruyako.model.MessageDto;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface MessageDao {

    List<MessageDto> getConversation(Long contactFromId, Long contactToId);

    void storeMessage(MessageDto messageDto);

}
