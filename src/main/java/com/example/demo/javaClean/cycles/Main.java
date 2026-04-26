package com.example.demo.javaClean.cycles;

public class Main {
    public static void main(String[] args) {
        // For
        // While
        // Do-while

        int count = 1;

        // Сначала проверка условия - потом цикл
        while (count < 5) {
            System.out.println("This never ends");
            count++;
        }

        System.out.println("finally");

        // Хотя бы один раз после чего будет проверка
        do {
            System.out.println("This never ends");
            count++;
        } while (count < 5);
        System.out.println("finally");

        // for
        for (int i = 1; i < 5; count++) {
            System.out.println("Ends");
        }

        System.out.println("finally");

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }

        System.out.println("End of loops");

    }
}
