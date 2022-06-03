package school.lesson5;


import java.util.Arrays;

class ChangeArrayElements<T> {
    public static void setIndex1inIndex2(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        setIndex1inIndex2(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
}



