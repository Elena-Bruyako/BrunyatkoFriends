package com.bruyako.impl;

import com.bruyako.HobbyDao;
import com.bruyako.HobbyService;
import com.bruyako.model.HobbyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 10.11.15.
 */
@Transactional
@Service
public class HobbyServiceImpl implements HobbyService {

    @Autowired
    private HobbyDao hobbyDao;

    @Override
    public void addHobby(HobbyDto hobbyDto) {

        hobbyDao.add(hobbyDto);
    }

    @Override
    public void deleteHobby(Long hobbyId) {
        hobbyDao.delete(hobbyId);
    }

    @Override
    public Set<HobbyDto> getAllHobbyForContact(Long contactId) {

        return hobbyDao.getAllHobbyForContact(contactId);
    }

    @Override
    public List<HobbyDto> getAllHobbies() {
        return hobbyDao.getAllHobby();
    }

    @Override
    public HobbyDto getById(Long hobbyId) {
        return hobbyDao.getById(hobbyId);
    }
}
