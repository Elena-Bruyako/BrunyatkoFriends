package com.bruyako;

import com.bruyako.dao.ContactDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by brunyatko on 24.09.15.
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FriendZoneService service = context.getBean(FriendZoneService.class);

        ContactDao contactDao = context.getBean(ContactDao.class);

        System.out.println(contactDao.getAll());

        context.close();


    }
}
