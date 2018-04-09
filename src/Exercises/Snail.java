package Exercises;

import java.util.Arrays;

public class Snail {
    /*
        array = [[1,2,3],
                 [4,5,6],
                 [7,8,9]]
        snail(array) #=> [1,2,3,6,9,8,7,4,5]
        array = [[1,2,3],
                 [8,9,4],
                 [7,6,5]]
        snail(array) #=> [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
        int[][] arr1 = {
                {1,   2,  3, 4, 5, 6, 0 ,0},
                {18, 19, 20,21,22, 7, 5 ,0},
                {18, 19, 20,21,22, 7, 0 ,0},
                {18, 19, 20,21,22, 7, 0 ,9},
                {18, 19, 20,21,22, 7, 0 ,0},
                {18, 19, 20,888,22, 7, 7 ,0},
                {17, 28, 29,30,23, 8, 0 ,9},
                {16, 27, 26,25,24, 9, 0 ,0},
                {15, 14, 13,12,11,10, 0 ,0},
        };
        int[][] arr2 = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        System.out.println(Arrays.toString(snailing(arr1)));
        System.out.println(Arrays.toString(snailing(arr2)));
    }


    private static int[] snailing(int[][] temp) {
        int horMin = 0;
        int horMax = temp[0].length;
        int vertMin = 0;
        int vertMax = temp.length;
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            count += temp[i].length;
        }
        int[] result = new int[count];
        int i = 0;
        while (count!=i) {
            for (int j = horMin; j < horMax; j++) {//prawo
                result[i] = temp[vertMin][j];
                i++;
            }
            vertMin++;
            if (count==i) break;
            for (int k = vertMin; k < vertMax; k++) {//dol
                result[i] = temp[k][horMax-1];
                i++;
            }horMax--;
            if (count==i) break;
            for (int j = horMax - 1; j> horMin; j--) {//lewo
                result[i] = temp[vertMax-1][j];
                i++;
            }vertMax--;
            if (count==i) break;
            for (int k = vertMax; k >= vertMin; k--) {//gora
                result[i] = temp[k][horMin];
                i++;
            }horMin++;
            if (count==i) break;
        }
        return result;
    }


}