package com.bruyako;

import com.bruyako.model.ContactDto;
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

    @RequestMapping(value = "/allContacts", method = RequestMethod.GET)
    public String getContact(Model model){

        model.addAttribute("allContacts", contactService.getAllContacts());

        return "friendZone";
    }

    @ResponseBody
    @RequestMapping(value = "/addNewContact", method = RequestMethod.POST)
    public String addContact(@RequestBody ContactDto contact) {

        contactService.addContact(contact);

        return "friendZone";
    }

    @RequestMapping(value = "/delete/{contactId}", method = RequestMethod.GET)
    public String deleteContact(@PathVariable("contactId") Long contactId) {

        contactService.deleteContact(contactId);

        return "friendZone";
    }

    @RequestMapping(value = "look/{contactId}", method = RequestMethod.GET)
    public String showContact(@PathVariable("contactId") Long contactId, Model model){

        model.addAttribute("contact", contactService.getContactById(contactId));

        return "friendZone";
    }
}
