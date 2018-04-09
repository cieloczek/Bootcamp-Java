package Sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sort(array)));
    }
    private static int[] sort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            int temp = array[i];
            for (int j = i; j > 0 ; j--) {
              if(array[j]<array[j-1]){
                  int val = array[j-1];
                    array[j-1] = array[j];
                    array[j]=val;
                }

            }

        }return array;
    }
}
