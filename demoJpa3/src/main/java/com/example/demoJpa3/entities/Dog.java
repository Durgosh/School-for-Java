package com.example.demoJpa3.entities;

import com.example.demoJpa3.pk.DogPk;

import javax.persistence.*;

@Entity
public class Dog {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private DogPk dogPk;

    private String name;
    private String color;


}
