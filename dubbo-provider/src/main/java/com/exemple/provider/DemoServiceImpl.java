package com.exemple.provider;

import com.example.api.DemoService;
import com.example.model.Person;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return name + " say hello";
    }
    public String callPerson(Person person){
        return  person.getName();
    }
}
