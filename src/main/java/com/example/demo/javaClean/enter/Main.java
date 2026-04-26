package com.example.demo.javaClean.enter;

import java.util.Scanner;

import com.example.demo.javaClean.objects.Person;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Person person2 = new Person(name);

        // final - один раз обьявили, и изменить нельзя (как const javascript);
        final int CONST = 3;

        // static - не конкретному екземлряру, а классу в целом пренадлежит- общая на
        // класс
        public static int cnt = 0;

    }
}
