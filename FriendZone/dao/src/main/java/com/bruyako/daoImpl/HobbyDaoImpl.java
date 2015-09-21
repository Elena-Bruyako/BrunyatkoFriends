package com.bruyako.daoImpl;

import com.bruyako.daoService.HobbyDaoService;
import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by brunyatko on 21.09.15.
 */

@Service
public class HobbyDaoImpl implements HobbyDaoService {
    @Override
    public void addHobby(String title, String description) {

    }

    @Override
    public Set<Contact> getAllContactsWithHobby(Hobby hobby) {
        return null;
    }
}
