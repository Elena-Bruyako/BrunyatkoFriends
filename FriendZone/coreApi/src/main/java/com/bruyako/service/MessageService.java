package com.bruyako.service;

import com.bruyako.model.Message;

/**
 * Created by brunyatko on 07.09.15.
 */
public interface MessageService {

    public void editMessage(Message message);
    public int countMessage(Message message);

}
