package com.bruyako.impl;

import com.bruyako.ContactDao;
import com.bruyako.HobbyDao;
import com.bruyako.HobbyService;
import com.bruyako.model.ContactDto;
import com.bruyako.model.HobbyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Service
public class HobbyServiceImpl implements HobbyService {

    @Autowired
    private ContactDao contactDao;

    @Autowired
    private HobbyDao hobbyDao;

    @Override
    public HobbyDto addHobby(String title, String description) {

        HobbyDto hobbyDto = new HobbyDto(title, description);
        hobbyDao.create(hobbyDto);
        return hobbyDto;
    }

    @Override
    public void setHobbyToContact(ContactDto contactDto, HobbyDto hobbyDto) {

        contactDao.addHobbyToContact(contactDto, hobbyDto);
    }

    @Override
    public Set<HobbyDto> getAllHobbyForContact(ContactDto contactDto) {

        return hobbyDao.getAllHobbyForContact(contactDto);
    }
}
