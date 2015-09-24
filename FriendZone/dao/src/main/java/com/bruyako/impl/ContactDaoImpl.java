package com.bruyako.impl;

import com.bruyako.dao.ContactDao;
import com.bruyako.model.Contact;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public class ContactDaoImpl implements ContactDao {

    @Override
    public Collection<Contact> getAllContact() {
        return null;
    }

    @Override
    public void add(Contact contact) {

    }

    @Override
    public void create(Contact contact) {

    }

    @Override
    public void edit(Contact contact) {

    }

    @Override
    public Contact get(String s) {
        return null;
    }

    @Override
    public void remove(String s) {

    }

    @Override
    public Contact update(Contact contact) {
        return null;
    }
}
