package school.lesson2;
/*
Написать метод, принимающий на вход два аргумента: len и initialValue,
и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 */

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int len = 10;
        int initialValue = 5;

        System.out.println(Arrays.toString(createArray(len, initialValue)));

    }

    public static int[] createArray(int len, int initialValue) {
        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = initialValue;
        }
        return myArray;
    }
}
