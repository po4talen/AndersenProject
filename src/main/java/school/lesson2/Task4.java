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
        System.out.println("Leap year is " + checkLeapYear(1900));
        System.out.println("Leap year is " + checkLeapYear(1992));
        System.out.println("Leap year is " + checkLeapYear(2000));
        System.out.println("Leap year is " + checkLeapYear(2002));

    }
    public static void printCycle(String text, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(text);
        }
    }

    public static boolean checkLeapYear(int year){
        if ((year%4 == 0 && ((year%400 ==0) || (year % 100 !=0)))){
            return true;
        }
        else {
            return false;
        }
    }
}
