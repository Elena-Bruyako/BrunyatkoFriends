package com.bruyako.impl;

import com.bruyako.dao.HobbyDao;
import com.bruyako.model.Hobby;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by brunyatko on 21.09.15.
 */

@Service
public class HobbyDaoImpl implements HobbyDao {


    @Override
    public Collection<Hobby> getAllContactWithHobby() {
        return null;
    }

    @Override
    public void add(Hobby hobby) {

    }

    @Override
    public void create(Hobby hobby) {

    }

    @Override
    public void edit(Hobby hobby) {

    }

    @Override
    public Hobby get(String s) {
        return null;
    }

    @Override
    public void remove(String s) {

    }

    @Override
    public Hobby update(Hobby hobby) {
        return null;
    }
}
