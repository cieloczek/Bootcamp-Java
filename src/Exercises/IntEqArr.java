package Exercises;

import java.util.ArrayList;
import java.util.List;

public class IntEqArr {
        public static void main(String[] args) {
            // index where sum of left side equals right side
            // returns 3
            int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
            // returns 1
            int[] arr2 = {1, 100, 50, -51, 1, 1};
            // returns 0
            int[] arr3 = {10, 10, -80, 10, 10, 15, 35};
            // return -1
            int[] arr4 = {1, 2, 3, 4};
            System.out.println(blabla(arr1));
            System.out.println(blabla(arr3));
            System.out.println("Array 1 : " + howLongAsymetric(arr1));
            System.out.println("Array 2 : " + howLongAsymetric(arr2));
            System.out.println("Array 3 : " + howLongAsymetric(arr3));
            System.out.println("Array 4 : " + howLongAsymetric(arr4));


        }
    public static int blabla (int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        int index = 0;
        while (index < array.length){
            for (int k = 0; k < index; k++) sumLeft += array[k];
            for (int j = array.length - 1; j > index; j--) sumRight += array[j];
            if (sumLeft == sumRight) return index;
            else sumRight = sumLeft = 0;
            index++;
        }
        return -1;
    }
    private static int howLongAsymetric(int[] arr){
            int leftSum =arr[0];
            int rightSum = arr[arr.length-1];
            int countLeft =0;
            int maxSum=-1;
            int tmp= arr.length-1;
            int countRight=arr.length-1;
            boolean equal = false;

                while (countLeft != countRight) {
                    if (leftSum == rightSum) {
                        leftSum += arr[countLeft];
                        countLeft++;
                        maxSum++;
                    } else if (leftSum > rightSum) {
                        rightSum += arr[countRight];
                        countRight--;
                        tmp--;
                    }   else if(rightSum > leftSum){
                        leftSum += arr[countLeft];
                        countLeft++;
                    }

                }
                if(leftSum==rightSum){
                    equal = true;

            }return maxSum;

    }
}
