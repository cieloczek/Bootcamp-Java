package Sorting;

import java.util.Arrays;
            public class MergeSort {
                public static void main(String[] args) {
                    int[] arrayToSort = {7, 4, 3, 5, 8, 2, 3};
                    mergeSort(arrayToSort, 0, arrayToSort.length - 1);
                    System.out.println(Arrays.toString(arrayToSort));
                }

                private static void mergeSort(int[] arrayToSort, int left, int right) {

                    if (left < right) {
                        int midIndex = (left + right) / 2;
                        mergeSort(arrayToSort, left, midIndex);
                        mergeSort(arrayToSort, midIndex + 1, right);
                        merge(arrayToSort, left, right, midIndex);

                    }

                }

                private static void merge(int[] arrayToSort, int left, int right, int mid) {
                    int[] a = new int[mid - left + 1];
                    int[] b = new int[right - mid];
                    int[] c = new int[right - left + 1];
                    int aI = 0;
                    int bI = 0;
                    int cI = 0;
                    for (int i = 0; i < a.length; i++) {
                        a[i] = arrayToSort[left + i];
                    }
                    for (int i = 0; i < b.length; i++) {
                        b[i] = arrayToSort[(mid + 1 + i)];
                    }
                    while (aI < a.length && bI < b.length) {
                        if (a[aI] > b[bI]) {
                            c[cI] = b[bI];
                            bI++;
                        } else {
                            c[cI] = a[aI];
                            aI++;
                        }
                        cI++;
                    }
                    for (int i = aI; i < a.length; i++) {
                        c[cI] = a[i];
                        cI++;
                    }
                    for (int i = bI; i < b.length; i++) {
                        c[cI] = b[i];
                        cI++;
                    }
                    System.out.println(Arrays.toString(c));
                    for (int i = left; i <= right; i++) {
                        arrayToSort[i] = c[i - left];
                    }

                }
            }