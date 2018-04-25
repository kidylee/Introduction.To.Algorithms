package sort;
import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {
        insertionSort(new int[]{5,2,4,6,1,3});
    }


    public static void insertionSort(int[] array){
        for(int j = 1; j < array.length; j++){
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                System.out.println(Arrays.toString(array) +" Switch " + array[i] + " at index " + i + " and " + array[i+1] + " at index " + (i + 1) );
                array[i+1] = array[i];
                i = i-1;
                array[i + 1] = key;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
