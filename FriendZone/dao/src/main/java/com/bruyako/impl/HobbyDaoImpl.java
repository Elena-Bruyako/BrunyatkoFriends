package com.bruyako.impl;

import com.bruyako.dao.HobbyDao;
import com.bruyako.model.Hobby;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by brunyatko on 21.09.15.
 */
@Service
public class HobbyDaoImpl implements HobbyDao {


    private Map<String, Hobby> hobbiesMaps = new HashMap<>();

    @Override
    public Collection<Hobby> getAllContactsWithHobby() {
        return hobbiesMaps.values();
    }

    @Override
    public void add(Hobby hobby) {
        hobbiesMaps.put(hobby.getTitle(), hobby);
    }

    @Override
    public void edit(Hobby hobby) {

    }

    @Override
    public Hobby get(String s) {
        return null;
    }

    @Override
    public void remove(Hobby hobby) {
        hobbiesMaps.remove(hobby);
    }

    @Override
    public Hobby update(Hobby hobby) {
        return null;
    }
}
