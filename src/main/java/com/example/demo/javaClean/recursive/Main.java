package com.example.demo.javaClean.recursive;

public class Main {
    public static void main(String[] args) {
        count(1);
    }

    // При вызове рекурсии нужно быть осторожным и обрабатывать ее;

    public static int count(int a) {
        if (a == 100) {
            return a;
        }
        a++;

        return count(a);
    }

    // factorial factorial(3);
    public static int factorial(int a) {
        if (a == 1) {
            return a;
        }

        return a * factorial(a - 1);
    }
}
