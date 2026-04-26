package com.example.demo.javaClean.objects;

public class Person {
    String name;

    public Person() {
    };

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNameSecondName(String name, String secondName) {
        System.out.println(name);
        System.out.println(secondName);
    }
}