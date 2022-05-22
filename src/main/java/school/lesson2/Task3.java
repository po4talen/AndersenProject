package school.lesson2;
/*
Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное,
и вернуть false если положительное. Замечание: ноль считаем положительным числом.
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println(checkPositiveNegativeValue(5));
        System.out.println(checkPositiveNegativeValue(0));
    }

    public static boolean checkPositiveNegativeValue(int value) {
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
