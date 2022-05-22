package school.lesson2;

/*
Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
*/
public class Task1 {
    public static void main(String args[]) {
        CheckSum(4, 6);
        CheckSum(0, 6);
    }
    public static boolean CheckSum(int value1, int value2) {
        int sum = value1 + value2;
        if (sum >= 10 & sum <= 20) {
            return true;
        } else {
            return false;
        }

    }
}