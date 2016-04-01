package com.bruyako.repository;

import com.bruyako.entity.Message;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class MessageRepository implements BaseRepository <Message, Long> {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void create(Message message) {
        getSession().save(message);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete from Message m where m.Message_id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void update(Message message) {
        getSession().saveOrUpdate(message);
    }

    @Override
    public Message getById(Long id) {
        Message message = (Message) getSession()
                .createQuery("select m.Message_id from Message m where m.Message_id = :id")
                .setParameter("id", id);
        return message;
    }

    @Override
    public List<Message> getAll() {
        List<Message> messages = getSession().createQuery("from Message").list();
        return messages;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
