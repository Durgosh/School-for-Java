package com.example.demoJpa2.entities;

import com.example.demoJpa2.pk.DogPk;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(DogPk.class)
public class Dog{
    // from primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int age;

    private String name;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
