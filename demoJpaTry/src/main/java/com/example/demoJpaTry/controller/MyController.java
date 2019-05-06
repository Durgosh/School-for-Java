package com.example.demoJpaTry.controller;

import com.example.demoJpaTry.identities.Person;
import com.example.demoJpaTry.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService){
        this.myService = myService;
    }

    @RequestMapping(path = "/getpeople", method = RequestMethod.GET)
    public List<Person> getPeople(){
        return myService.getPeople();
    }
}
