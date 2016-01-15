package com.bruyako.impl;

import com.bruyako.AlbumDao;
import com.bruyako.AlbumService;
import com.bruyako.model.AlbumDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by brunyatko on 19.11.15.
 */
@Transactional
@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDao albumDao;

    @Override
    public Set<AlbumDto> getAllAlbumForContact(Long contactId) {
        return albumDao.getAllAlbumForContact(contactId);
    }

    @Override
    public AlbumDto getAlbumById(Long albumId) {
        return albumDao.getById(albumId);
    }

    @Override
    public void addAlbum(AlbumDto albumDto) {
        albumDao.add(albumDto);
    }

//    @Override
//    public void deleteAlbum(AlbumDto albumDto) {
//        albumDao.delete(albumDto);
//    }

}
