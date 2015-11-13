package com.bruyako;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by brunyatko on 24.09.15.
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PhotoDao photo = context.getBean(PhotoDao.class);
        System.out.println(photo.getAllPhotosFotContact(1L));

        context.close();


    }
}
