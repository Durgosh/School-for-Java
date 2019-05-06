package com.example.demoJpaTry.service;

import com.example.demoJpaTry.identities.Person;
import com.example.demoJpaTry.repository.JobRepository;
import com.example.demoJpaTry.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyService {

    private final JobRepository jobRepository;
    private final PersonRepository personRepository;

    @Autowired
    public MyService(JobRepository jobRepository, PersonRepository personRepository){
        this.jobRepository = jobRepository;
        this.personRepository = personRepository;
    }

    public List<Person> getPeople(){
        return personRepository.findAll();
    }
}
