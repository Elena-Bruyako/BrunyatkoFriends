package com.bruyako.impl;

import com.bruyako.MessageDao;
import com.bruyako.model.MessageDto;
import org.hibernate.Query;
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

//        Query query = sessionFactory.getCurrentSession().createQuery("FROM Message M  WHERE (M.contactFromId = :contactFromId AND M.contactToId = :contactToId) " +
//                "OR (M.contactFromId = :contactToId AND M.contactToId = :contactFromId) ORDER BY message_time ASC ");
//        query.setParameter("contactFromId", contactFromId);
//        query.setParameter("contactToId", contactToId);

        return null;

    }

    @Override
    public void storeMessage(MessageDto messageDto) {
//        sessionFactory.getCurrentSession().saveOrUpdate(messageDto);
    }

}
