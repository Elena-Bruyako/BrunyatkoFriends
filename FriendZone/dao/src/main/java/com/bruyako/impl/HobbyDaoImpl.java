package com.bruyako.impl;

import com.bruyako.dao.HobbyDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class HobbyDaoImpl implements HobbyDao {

    private Map<String, Hobby> hobbiesMaps = new HashMap<>();

    @PostConstruct
    public void init(){

        Hobby hobby = new Hobby();

        hobby.setTitle("Photo");
        hobby.setDescription("Taking a picture");

        hobbiesMaps.put(hobby.getTitle(), hobby);
    }

    @Override
    public List<Contact> getAllContactsWithHobby(Hobby hobby) {
        return null;
    }

    @Override
    public void create(Hobby hobby) {
        hobbiesMaps.put(hobby.getTitle(), hobby);
    }

    @Override
    public void delete(Hobby hobby) {

    }

    @Override
    public void update(Hobby hobby) {

    }

    @Override
    public List<Hobby> getAll() {
        return null;
    }

    @Override
    public Hobby getById(Long id) {
        return null;
    }

}
