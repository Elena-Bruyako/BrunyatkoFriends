package com.bruyako.dao;

import com.bruyako.model.Contact;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */
public interface ContactDao extends AbstractDao<Contact, String> {

    Collection<Contact> getAllContact();

}


