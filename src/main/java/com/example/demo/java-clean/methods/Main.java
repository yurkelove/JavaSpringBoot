public class Main {
    public static void main(String[] args) {
        greet();

        int resultofAdding = addNew(10, 20);
    }

    public static void greet() {
        System.out.println("Welcome to Methods");
    }

    public static void makePeperoni() {
        prepareDough();
    }

    public static void makeHawaii() {
        prepareDough();
        System.out.println("Adding a peperoni");
        finishPizza();
    }

    public static void prepareDough() {
        System.out.println("Adding a sauce");
        System.out.println("Adding a cheese");
        finishPizza();
    }

    public static void finishPizza() {
        System.out.println("Finish pizza");
        add(10, 20);
    }

    // Params
    public static void add(int a, int b) {
    }

    // Такое же имя метода но нужно его переделать
    public static void add(int a, int b, int c) {
    }

    public static int addNew(int a, int b) {
        return a + b;
    }

}
