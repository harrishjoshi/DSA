package com.harxsh.selectionsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted arr: " + Arrays.toString(arr));

        /*
         * Working:
         * 1. Set the first element as largest
         * 2. Compare largest with the second element.
         *  If the second element is larger than largest, assign the second element as largest.
         *  The process goes on until the last element.
         * 3. After each iteration, largest is placed in the end of the unsorted array.
         */

        // loop to access each array elements
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // stores largest element index position
            int largest = 0;

            // loop to find largest element index
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                // check if current element is larger than previous
                // if true update the largest index
                // to sort in descending order
                // we need to change > to < while comparing
                if (arr[i] > arr[largest])
                    largest = i;
            }

            // swap largest element position to last unsorted index
            swap(arr, largest, lastUnsortedIndex);
        }

        System.out.println("Unsorted arr: " + Arrays.toString(arr));
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