package exercise;

import java.util.Arrays;

public class Exercises2$1_2 {
    public static void main(String[] args) {
        insertionSort(new int[]{ 31, 41, 59, 26, 41, 58});
    }


    public static void insertionSort(int[] array){
        for(int j = 1; j < array.length; j++){
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] < key) {
                System.out.println(Arrays.toString(array) +" Switch " + array[i] + " at index " + i + " and " + array[i+1] + " at index " + (i + 1) );
                array[i+1] = array[i];
                i = i-1;
                array[i + 1] = key;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
