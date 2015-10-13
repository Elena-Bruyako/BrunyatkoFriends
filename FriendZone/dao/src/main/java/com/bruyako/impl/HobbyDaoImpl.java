package com.bruyako.impl;

import com.bruyako.dao.HobbyDao;
import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by brunyatko on 21.09.15.
 */
@Repository
public class HobbyDaoImpl implements HobbyDao {

    private static long id = 1;
    private Map<Long, Hobby> hobbiesMaps = new HashMap<>();

    @Override
    public Set<Contact> getAllContactsWithHobby(Hobby hobby) {

        return hobby.getHobbiesOfContact();
    }

    @Override
    public void create(Hobby hobby) {

        hobby.setId(id++);
        hobbiesMaps.put(hobby.getId(), hobby);
    }

    @Override
    public void delete(Hobby hobby) {

        Long tmp = null;

        for (Map.Entry entry : hobbiesMaps.entrySet()) {
            if (entry.getValue().equals(hobby)) {
                tmp = (Long) entry.getKey();
                break;
            }
        }
        hobbiesMaps.remove(tmp);
    }

    @Override
    public List<Hobby> getAll() {

        List<Hobby> allHobbies = new ArrayList<>();

        for (Map.Entry entry : hobbiesMaps.entrySet()) {
            allHobbies.add((Hobby) entry.getValue());
        }

        return allHobbies;
    }

    @Override
    public Hobby getById(Long id) {

        Hobby hobbyById = null;

        for (Map.Entry entry : hobbiesMaps.entrySet()) {
            if (entry.getKey().equals(id)) {
                hobbyById = (Hobby) entry.getValue();
            }
        }

        return hobbyById;
    }

}
