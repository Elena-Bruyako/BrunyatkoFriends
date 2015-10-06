package com.bruyako;

import com.bruyako.model.Contact;
import com.bruyako.model.Hobby;
import com.bruyako.model.Place;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

/**
 * Created by brunyatko on 24.09.15.
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FriendZoneService service = context.getBean(FriendZoneService.class);

        Contact contact = service.getAllContacts().iterator().next();
        Hobby hobby = service.getAllHobbies().iterator().next();
        Place place = service.getAllPlaces().iterator().next();
        System.out.println(contact);
        System.out.println(hobby);
        System.out.println(place);

        context.close();

    }
}
