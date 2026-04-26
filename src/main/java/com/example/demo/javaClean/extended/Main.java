package com.example.demo.javaClean.extended;

public class Main {
    public static void main(String[] args) {
        // Используем
        Dog tusic = new Dog("Bobik", 1, "grey");
        tusic.makeSound();

        Animal animal = new Animal("animal", 1);
        animal.makeSound();

        // Перегрузка методов
        tusic.overload();
        tusic.overload("Bobik");
    }
}
