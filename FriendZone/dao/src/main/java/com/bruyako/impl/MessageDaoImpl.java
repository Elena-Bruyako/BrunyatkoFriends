package com.bruyako.impl;

import com.bruyako.dao.MessageDao;
import com.bruyako.model.Message;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class MessageDaoImpl implements MessageDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Message> getConversation(Long contactFromId, Long contactToId) {

        Query query = sessionFactory.getCurrentSession().createQuery("FROM Message M  WHERE (M.contactFromId = :contactFromId AND M.contactToId = :contactToId) " +
                "OR (M.contactFromId = :contactToId AND M.contactToId = :contactFromId) ORDER BY message_time ASC ");
        query.setParameter("contactFromId", contactFromId);
        query.setParameter("contactToId", contactToId);

        return query.list();

    }

    @Override
    public void storeMessage(Message message) {
        sessionFactory.getCurrentSession().saveOrUpdate(message);
    }

}
