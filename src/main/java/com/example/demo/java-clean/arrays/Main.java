public class Main {
    public static void main(String[] args) {
        int[] scores;
        String[] names;
        double[] values;
        boolean[] flags;

        scores = new int[] { 10, 20, 50, 100 };
        names = new String[] { "Yura", "Ivan", "Petr" };

        // default value = 0; массив длиной 10 элементов
        int[] unknows = new int[10];

        int quizResult3 = scores[2];

        // actions with array
        int length = scores.length;

        for (int i = 0; i <= scores.length; i++) {
            System.out.println(names[i]);
        }

        for (String n : names) {
            System.out.println(n);
        }

        for (int s : scores) {
            System.out.println("Score is" + s);
        }

        // default value = 0;
        int[] unknowsScores = new int[10];
        int value = 2;

        for (int i = 0; i < unknowsScores.length; i++) {
            unknowsScores[i] = value;
            value *= 2;
        }

        for (int s : unknowsScores) {
            System.out.println("Score is" + s);
        }
    }
}
