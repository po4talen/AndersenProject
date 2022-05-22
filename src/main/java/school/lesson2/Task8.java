package school.lesson2;


/*	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
	и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
	Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

public class Task8 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        fillDiagonal(arr);
        printTwoDimArray(arr);

    }

    public static void fillDiagonal(int[][] array) {
        //   int value = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j) || ((i + j) == (array.length - 1))) {
                    array[i][j] = 1;
                }
            }
        }
    }

    public static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }

}

