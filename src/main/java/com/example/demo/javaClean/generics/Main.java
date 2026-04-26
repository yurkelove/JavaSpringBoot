package com.example.demo.javaClean.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        Person person = new Person();

        list.add("Tom");
        list.add("Jack");
        list.add("Sam");

        String name = (String) list.get(0);

        // Generics
        List<String> list2 = new ArrayList<>();
        list2.add("Tom");
        list2.add("Jack");
        list2.add("Sam");

        String name2 = (String) list2.get(0);

    }
}

class Person {
}
