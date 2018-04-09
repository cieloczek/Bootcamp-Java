package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(ThreadLocalRandom.current().nextInt(100));
        }
        System.out.println(list);
        quickSort(list, 0, list.size() - 1);
        System.out.println(list);
    }

    private static void quickSort(List<Integer> list, int left, int right) {
        int pivotIndex = (left + right) / 2;
        int pivot = list.get(pivotIndex);
        list.set(pivotIndex,list.get(right));
        list.set(right,pivot);
        int j = left; //tu moze sie wyjebać
        for (int i = left; i < right; i++) {
            if (list.get(i) < pivot) {
                int tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j,tmp);
                System.out.println(list);
                j++;
            }
        }
        list.set(right,list.get(j));
        list.set(j,pivot);
        if(left<j-1){
            quickSort(list,left,j-1);
        }
        if(j+1<right){
            quickSort(list,j+1,right);
        }
        //System.out.println(list);
    }
}
