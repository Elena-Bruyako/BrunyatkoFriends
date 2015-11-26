package com.bruyako;

import com.bruyako.model.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

//    @ResponseBody
//    @RequestMapping(value = { "/newContact" }, method = RequestMethod.POST)
//    public String addContact(@RequestBody ContactDto contactDto, Model model) {
//
//        if (result.hasErrors()) {
//            return "registrationPage";
//        }
//        contactService.addContact(contactDto);
//
//        model.addAttribute("Contact " + contactDto.getFirstName() + " " + contactDto.getLastName());
//
//        return "redirect:/allContacts";
//    }

    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String addContact(@ModelAttribute("newContact") ContactDto contactDto, BindingResult result,
                             Model model) {

        contactService.addContact(contactDto);

        model.addAttribute("success", "Contact " + contactDto.getFirstName()+" "+contactDto.getLastName()
                + " registered successfully");
        return "redirect:/allContacts";
    }

    @RequestMapping(value = "/delete/{contact}", method = RequestMethod.GET)
    public String deleteContact(@PathVariable("contact")
                                    ContactDto contactDto) {

        contactService.deleteContact(contactDto);

        return "redirect:/allContacts";
    }

    @RequestMapping(value = "/look{contact}", method = RequestMethod.GET)
    public String lookContact(@PathVariable("contact")
                                ContactDto contactDto) {

        contactService.getContactById(contactDto.getContactId());

        return "redirect:/allContacts";
    }
}
