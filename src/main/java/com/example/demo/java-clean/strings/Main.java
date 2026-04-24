import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "Hello";
        char[] array = new char[] { 'H', 'e', 'l', 'l', 'o' };

        String s1 = new String("World"); // так тоже можно создать строку

        String name = "Steven";
        int age = 25;
        double balance = 12.6;

        String formatted = String.format("===== %s %s!!! =====", s, s1);

        String formattedUser = String.format("User: %s; age: %d; balance: %f", name, age, balance);

        // Принимаем данные System.in - принимаем
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.printf("Hello %s", name);

        // Methods
        String message = "Java is my favorite programming languege";
        message.length();
        message.charAt(11); // f
        message.equals("Java is my favorite programming lang"); // false
        message.equalsIgnoreCase("Java is my favorite programming lang"); // игнорирует регистр
        message.toUpperCase();
        message.toLowerCase();
        message.indexOf('i'); // 5 - первое включение буквы
        message.indexOf("favorite"); // 11 - первое включение буквы
        message.contains("x"); // true or false
        message.isEmpty(); // пустая строка или нет
        message.replace("Java", "Javascript");

    }
}
