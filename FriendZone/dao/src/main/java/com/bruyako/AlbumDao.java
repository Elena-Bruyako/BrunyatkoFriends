package com.bruyako;

import com.bruyako.model.AlbumDto;
import com.bruyako.model.PhotoDto;

import java.util.Set;

/**
 * Created by brunyatko on 19.11.15.
 */
public interface AlbumDao extends AbstractDao<AlbumDto, Long> {

    Set<AlbumDto> getAllAlbumForContact(Long contactId);

}
