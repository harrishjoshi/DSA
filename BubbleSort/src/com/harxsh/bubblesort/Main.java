package com.harxsh.bubblesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted arr: " + Arrays.toString(arr));

        /*
         * Working:
         * 1. First Iteration (Compare and Swap)
         * i. Starting from the first index, compare he first and the second elements.
         * ii. If the first element is greater than the second element, they are swapped.
         * iii.Now, compare the second and the third elements. Swap then if they are not in order.
         * iv. The above process goes on unit the last element.
         * 2. Remaining Iteration
         * i. The same process goes on for the remaining iterations.
         * ii. After each iteration, the largest element among the unsorted elements is placed at the end.
         */

        // loop to access each array element
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // check if swapping occurs
            boolean swapped = false;

            // loop to compare array elements
            for (int i = 0; i < lastUnsortedIndex; i++) {
                // compare two adjacent elements
                // swap if elements are not in the intended order
                // to sort in descending order
                // we need to change > to < while comparing
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }

            // no swapping means the array is already sorted
            // so no need to for further comparison
            if (!swapped)
                break;
        }

        System.out.println("Sorted arr: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        // if indexes are same then no need to swap
        if (i == j)
            return;

        // swap the elements in intended position
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}