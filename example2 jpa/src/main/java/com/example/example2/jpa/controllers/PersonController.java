package com.example.example2.jpa.controllers;

import com.example.example2.jpa.entities.Person;
import com.example.example2.jpa.serivces.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    final PersonService personService;

    @Autowired
    PersonController(PersonService personService){
        this.personService = personService;
    }

    @RequestMapping(path = "/getPeople", method = RequestMethod.GET)
    public List<Person> getPeople(){
        return personService.getPeople();
    }

    @RequestMapping(path = "/getPersonById/{personId}",method = RequestMethod.GET)
    public Person getPersonbyId(@PathVariable int personId){
        return personService.getPersonById(personId);
    }
}
