package com.bruyako;

import com.bruyako.model.ContactDto;
import com.bruyako.model.HobbyDto;
import com.bruyako.model.PlaceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by brunyatko on 06.11.15.
 */
@Controller
public class MainController {

    @Autowired
    private ContactService contactService;
    @Autowired
    private HobbyService hobbyService;
    @Autowired
    private PlaceService placeService;
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/allContacts", method = RequestMethod.GET)
    public String getContact(Model model){

        model.addAttribute("allContacts", contactService.getAllContacts());
        model.addAttribute("allHobbies", hobbyService.getAllHobbies());
        model.addAttribute("allPlaces", placeService.getAllPlaces());
        model.addAttribute("allPosts", postService.getAllPost());
        return "friendZone";
    }

    @ResponseBody
    @RequestMapping(value = "/addNewContact", method = RequestMethod.POST)
    public String addContact(@RequestBody ContactDto contact) {

        contactService.addContact(contact);

        return "friendZone";
    }

    @ResponseBody
    @RequestMapping(value = "addNewHobby", method = RequestMethod.POST)
    public String addNewHobby(@RequestBody HobbyDto hobbyDto) {

        hobbyService.addHobby(hobbyDto);

        return "friendZone";
    }

    @ResponseBody
    @RequestMapping(value = "addNewPlace", method = RequestMethod.POST)
    public String addNewPlace(@RequestBody PlaceDto placeDto) {

        placeService.addPlace(placeDto);

        return "friendZone";
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{contactId}", method = RequestMethod.GET)
    public String deleteContact(@PathVariable("contactId") Long contactId) {

        contactService.deleteContact(contactId);

        return "friendZone";
    }

    @RequestMapping(value = "/look/{contactId}", method = RequestMethod.GET)
    public String showContact(@PathVariable("contactId") Long contactId, Model model){

        model.addAttribute("contact", contactService.getContactById(contactId));
        model.addAttribute("hobby", hobbyService.getAllHobbyForContact(contactId));
        model.addAttribute("place", placeService.getAllPlaceForContact(contactId));
        model.addAttribute("post", postService.getAllPostsForContact(contactId));
        model.addAttribute("allHobbies", hobbyService.getAllHobbies());
        model.addAttribute("allPlaces", placeService.getAllPlaces());
        model.addAttribute("allPosts", postService.getAllPost());

        return "contactInfo";
    }

    @ResponseBody
    @RequestMapping(value = "/look/{contactId}/{hobbyId}", method = RequestMethod.GET)
    public String addHobbyToContact(@PathVariable("contactId") Long contactId, @PathVariable("hobbyId") Long hobbyId) {

        contactService.addHobbyToContact(contactId, hobbyId);
        return "contactInfo";
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{contactId}/{hobbyId}", method = RequestMethod.GET)
    public String deleteHobby(@PathVariable("contactId") Long contactId, @PathVariable("hobbyId") Long hobbyId) {

        contactService.deleteHobbyToContact(contactId, hobbyId);

        return "contactInfo";
    }
}
