package com.example.consumer;

import com.example.api.DemoService;
import com.example.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/dubbo-consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("wyy");

        Person person = new Person();
        person.setName("person");
        hello= hello + demoService.callPerson(person);      //参数为对象
        // Display the call result
        System.out.println(hello);
        System.in.read(); // press any key to exit

    }
}
