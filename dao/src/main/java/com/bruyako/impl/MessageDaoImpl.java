package com.bruyako.impl;

import com.bruyako.MessageDao;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.Contact;
import com.bruyako.entity.Message;
import com.bruyako.model.MessageDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Transactional
@Repository
public class MessageDaoImpl implements MessageDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<MessageDto> getConversation(Long contactFromId, Long contactToId) {

        Contact fromContact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactFromId);
        Contact toContact = (Contact) sessionFactory.getCurrentSession().get(Contact.class, contactToId);

        List<Message> messages = fromContact.getConversation();

        List<MessageDto> result = new ArrayList<>(messages.size());

        for (Message message : messages) {

            result.add(EntityDtoConverter.convert(message));
        }

        return result;
    }

    @Override
    public void storeMessage(MessageDto messageDto) {

        Message message = EntityDtoConverter.convert(messageDto);

        sessionFactory.getCurrentSession().saveOrUpdate(message);
    }
}
