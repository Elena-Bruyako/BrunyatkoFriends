package com.bruyako;

import com.bruyako.model.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by brunyatko on 06.11.15.
 */
@Controller
public class MainController {

    @Autowired
    private ContactService contact;
    @Autowired
    private HobbyService hobby;
    @Autowired
    private LikePhotoService likePhoto;
    @Autowired
    private LikePostService likePost;
    @Autowired
    private MessageService message;
    @Autowired
    private PhotoService photo;
    @Autowired
    private PlaceService place;
    @Autowired
    private PostService post;

    @RequestMapping(value = "/allContacts", method = RequestMethod.GET)
    public String getContact(Model model){

        model.addAttribute("allContacts", contact.getAllContacts());
        return "friendZone";
    }


}
