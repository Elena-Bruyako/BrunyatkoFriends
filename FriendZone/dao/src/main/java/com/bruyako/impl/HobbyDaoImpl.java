package com.bruyako.impl;

import com.bruyako.dao.HobbyDao;
import com.bruyako.model.Hobby;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public class HobbyDaoImpl implements HobbyDao {

    private Map<String, Hobby> hobbiesMaps = new HashMap<>();

    Hobby hobby = new Hobby();

    @PostConstruct
    public void init(){

        hobby.setTitle("Photo");
        hobby.setDescription("Taking a picture");

        hobbiesMaps.put(hobby.getTitle(), hobby);
    }

    @Override
    public Collection<Hobby> getAllContactsWithHobby(Hobby hobby) {
        return null;
    }

    @Override
    public void create(Hobby hobby) {
        hobbiesMaps.put(hobby.getTitle(), hobby);
    }

    @Override
    public void delete(Hobby hobby) {
        hobbiesMaps.remove(hobby);
    }

    @Override
    public Hobby update(String s) {
        return null;
    }

    @Override
    public Hobby get(String s) {
        return hobbiesMaps.get(s);
    }

}
