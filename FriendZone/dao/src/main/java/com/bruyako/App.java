package com.bruyako;

import com.bruyako.model.Contact;
import com.bruyako.service.ContactService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by brunyatko on 21.09.15.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(context.getBeansOfType(Contact.class));

        ContactService service = context.getBean(ContactService.class);

        System.out.println(service);

    }
}
