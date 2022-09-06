package com.harxsh.bubblesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted arr: " + Arrays.toString(arr));

        /* At first:
         * unsortedPartitionIndex = 6; this is the last index of the unsorted partition
         * i = 0 to 6; index used to traverse the array from left to right
         * after every traverse the last element will be at sorted partition
         * next traverse
         * unsortedPartitionIndex = 5
         * i = 0 to 5
         * at the end of this traverse element at index 5 will be at sorted partition
         */
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1])
                    swap(arr, i, i + 1);
            }
        }

        System.out.println("Sorted arr: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        // if indexes are same return
        if (i == j)
            return;

        // store one value to temp
        // then swap the elements
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}