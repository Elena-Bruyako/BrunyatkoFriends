package com.bruyako;

import com.bruyako.model.AlbumDto;
import com.bruyako.model.PhotoDto;

import java.util.Set;

/**
 * Created by brunyatko on 19.11.15.
 */
public interface AlbumService {

    Set<AlbumDto> getAllAlbumForContact(Long contactId);

    AlbumDto getAlbumById(Long albumId);

    void addAlbum(AlbumDto albumDto);

    void deleteAlbum(AlbumDto albumDto);
}
