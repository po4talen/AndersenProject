package school.lesson2;

import java.util.Arrays;
/*
Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        fillArray(arr);

    }

    public static void fillArray(int[] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value++;
        }
        System.out.print(Arrays.toString(array));
    }

}
