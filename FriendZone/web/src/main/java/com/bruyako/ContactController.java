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
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/allContacts", method = RequestMethod.GET)
    public String allContacts(Model model){

        List<ContactDto> allContacts = contactService.getAllContacts();

        model.addAttribute("contacts", allContacts);

        return "allContacts";

    }

}
