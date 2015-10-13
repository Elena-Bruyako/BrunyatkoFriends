package com.bruyako;

import com.bruyako.model.Contact;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by brunyatko on 24.09.15.
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FriendZoneService service = context.getBean(FriendZoneService.class);

        Contact contact = service.getAllContacts().iterator().next();

        System.out.println(contact);

        context.close();


    }
}
