package com.bruyako.repository;

import com.bruyako.entity.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class ContactRepository implements BaseRepository<Contact, Long> {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public void create(Contact contact) {
        getSession().save(contact);
    }

    @Override
    public void delete(Long id) {
        Query query = getSession().createQuery("delete from Contact c where c.Contact_id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void update(Contact contact) {
        getSession().saveOrUpdate(contact);
    }


    @Override
    public List<Contact> getAll() {
        List<Contact> contacts = getSession().createQuery("from Contact").list();
        return contacts;
    }

    @Override
    public Contact getById(Long id) {
        Contact contact = (Contact) getSession()
                .createQuery("select c.Contact_id from Contact c where c.Contact_id = :id")
                .setParameter("id", id);
        return contact;

    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
