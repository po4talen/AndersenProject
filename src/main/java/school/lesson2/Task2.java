package school.lesson2;

/*
Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */

public class Task2 {
    public static void main(String[] args) {
        checkPositiveNegativeValue(-3);
        checkPositiveNegativeValue(0);
        checkPositiveNegativeValue(10);

    }
    public static void checkPositiveNegativeValue(int value) {
        if (value >= 0) {
            System.out.println("Value " + value + " is positive");
        }
        else {
            System.out.println("Value " + value + " is negative");
        }

    }
}
