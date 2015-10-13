package com.bruyako;

import com.bruyako.dao.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by brunyatko on 12.10.15.
 */

@RunWith(MockitoJUnitRunner.class)
public class FriendZoneServiceTest {

    @Mock
    private ContactDao contactDao;
    @Mock
    private HobbyDao hobbyDao;
    @Mock
    private MessageDao messageDao;
    @Mock
    private PlaceDao placeDao;
    @Mock
    private PostDao postDao;

    @InjectMocks
    private FriendZoneServiceImpl service = new FriendZoneServiceImpl();


}
