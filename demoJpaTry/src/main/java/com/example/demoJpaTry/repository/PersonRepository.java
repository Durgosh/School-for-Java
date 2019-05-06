package com.example.demoJpaTry.repository;

import com.example.demoJpaTry.identities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
