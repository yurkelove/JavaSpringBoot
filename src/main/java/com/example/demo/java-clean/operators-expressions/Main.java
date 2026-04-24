public class Main {
    public static void main(String[] args) {
        /*
         * 3 operator types
         * arithmetic operators
         * + - / % ++ --
         * 
         * relational operators
         * > < >= <= == !=
         * 
         * logicial operators
         * && || !
         * 
         */

        int x = 100;
        int y = 5;

        double d = 3.0;

        int summ = x + y;

        int division = x / y;
        // 100 / 3 = 33, игнорируем десетичные - при деление лучше тип double
        double division2 = x / y; // одна из должна быть double, для корректности вычисления

        int remainder = x % y; // = 1 - остаток от деления

        // postfix vs prefix

        // prefix (++z) - сработает с 10 будет 11
        // postfix (z++) - не сработает будет первое значение 10

        /*
         * relational operators
         * > < >= <= == !=
         */

        /*
         * logicial operators - && || !
         */
    }
}
