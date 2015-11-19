package com.bruyako.impl;

import com.bruyako.MessageDaoInterface;
import com.bruyako.converters.EntityDtoConverter;
import com.bruyako.entity.MessageDao;
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
public class MessageDaoImpl implements MessageDaoInterface {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<MessageDto> getConversation(Long contactFromId, Long contactToId) {

        List<MessageDao> messages = sessionFactory.getCurrentSession().createSQLQuery("select * from Message m where (m.Contact_From_id = :contactFromId and " +
                "m.Contact_To_id = :contactToId) or (m.Contact_From_id = :contactToId and m.Contact_To_id = :contactFromId) " +
                "order by Message_Time asc").addEntity(MessageDao.class).setParameter("contactFromId", contactFromId).setParameter("contactToId", contactToId).list();


        List<MessageDto> result = new ArrayList<>(messages.size());

        for (MessageDao message : messages) {

            result.add(EntityDtoConverter.convert(message));
        }

        return result;
    }

    @Override
    public void storeMessage(MessageDto messageDto) {

        MessageDao message = EntityDtoConverter.convert(messageDto);

        sessionFactory.getCurrentSession().saveOrUpdate(message);
    }
}
