package com.example.demo.javaClean.toString;

public class ToString {
    public static void main(String[] args) {
        Person person = new Person("Jack");
        System.out.println(person.hashCode()); // числовое значение

        Person david = new Person("David");
        Person sofia = new Person("Sofia");
        System.out.println(david.equals(sofia)); // Сравнение значений обьектов

        check(david);
        check(sofia);
    }

    private static void check(Object o) {
        // какой обьект - к какому классу относиться
        if (o instanceof Person) {
            System.out.println(((Person).o).getName());
        } else {
            System.out.println(o.getClass());
        }

    }

}
