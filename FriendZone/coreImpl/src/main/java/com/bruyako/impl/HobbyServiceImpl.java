package com.bruyako.impl;

import com.bruyako.HobbyDaoInterface;
import com.bruyako.HobbyService;
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
    private HobbyDaoInterface hobbyDao;

    @Override
    public void addHobby(HobbyDto hobbyDto) {

        hobbyDao.add(hobbyDto);
    }

    @Override
    public void deleteHobby(HobbyDto hobbyDto) {
        hobbyDao.delete(hobbyDto);
    }

    @Override
    public Set<HobbyDto> getAllHobbyForContact(Long contactId) {

        return hobbyDao.getAllHobbyForContact(contactId);
    }

    @Override
    public HobbyDto getById(Long hobbyId) {
        return hobbyDao.getById(hobbyId);
    }
}
