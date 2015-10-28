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

//    private List<Message> messages = new ArrayList<>();

    @Override
    public List<Message> getConversation(Long contactFrom, Long contactTo) {

        Query query = sessionFactory.getCurrentSession().createQuery("FROM Message M  WHERE (M.contactFrom = :contactFrom AND M.contactTo = :contactTo) " +
                "OR (M.contactIdFrom = :id2 AND M.contactIdTo = :id1) ORDER BY message_time ASC ");
        query.setParameter("contactFrom", contactFrom);
        query.setParameter("contactTo", contactTo);

        return query.list();

    }

    @Override
    public void storeMessage(Message message) {
//        messages.add(message);
        sessionFactory.getCurrentSession().saveOrUpdate(message);
    }

}
