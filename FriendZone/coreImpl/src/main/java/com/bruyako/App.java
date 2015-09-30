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

        service.createContact(3L, "Elena", "Bruyako", LocalDate.of(1990, 8, 02));
        service.addHobby("Photo", "Taking a picture");
        service.addPlace("Georgia", "Beautiful places",49.4654564, 50.5656465);

        Contact contact = service.getAllContacts().iterator().next();
        Hobby hobby = service.getAllHobbies().iterator().next();
        Place place = service.getAllPlaces().iterator().next();
        System.out.println(contact);
        System.out.println(hobby);
        System.out.println(place);

        context.close();

    }
}
