package school.lesson2;
/*
1) метод, которому в качестве аргументов передается строка и число,
метод должен отпечатать в консоль указанную строку, указанное количество раз;

2) * Написать метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

public class Task4 {
    public static void main(String[] args) {
        printCycle("Text", 5);
    }
    public static void printCycle(String text, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(text);
        }
    }
}
