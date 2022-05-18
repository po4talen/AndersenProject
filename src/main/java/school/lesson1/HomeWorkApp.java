package school.lesson1;

/*First Java Program.

 */
public class HomeWorkApp {
    public static void main(String args[]) {
        printThreeApp();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeApp() {
        System.out.println("Orange \n" + "Banana \n" + "Apple");

    }

    public static void checkSumSign() {
        int a = 2;
        int b = -5;
        if ((a + b) >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int value = -1;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value >= 1 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers(){
        int a = 50;
        int b = 10;
        String result = (a >= b) ? "a >= b" : "a < b";
        System.out.println(result);

    }
}
