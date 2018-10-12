package com.exemple.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-provider.xml"});
        context.start();
        System.out.println("dubbo Provider started.");
        System.in.read(); // press any key to exit
    }
}
