package com.example.demo.javaClean.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("100%");
        }
    }

    // Так же можем убрать try и пробросить выше public static throws
    // FileNotFoundException - выбросит на верх - обработка будет в main
    public static void main() {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner scanner = new Scanner(file);
    }

    // Неправеряемые исключения
    public static void math() {
        int number = 10;
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        // обработка ошибок через if
        System.out.println(number / i);
    }

    // Ошибки
    public static int stackOverFlowGenerator(int i) {
        // куча ошибок memory-errors
        return stackOverFlowGenerator(i);
    }
}
