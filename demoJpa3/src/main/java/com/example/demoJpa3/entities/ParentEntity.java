package com.example.demoJpa3.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass // tells it to include this
public class ParentEntity {

    private int age;
}
