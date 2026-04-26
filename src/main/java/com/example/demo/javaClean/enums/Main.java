package com.example.demo.javaClean.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Seasons.WINTER.getValue()); // Зима, без getValue - WINTER
    }
}

enum Seasons {
    WINTER("Зима"),
    SUMMER("Лето"),
    AUTUMN("Осень"),
    SPRING("Весна");

    private String value;

    Seasons(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
