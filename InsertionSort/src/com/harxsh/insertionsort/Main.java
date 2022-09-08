package com.harxsh.insertionsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted arr: " + Arrays.toString(arr));

        /*
         * Working:
         */

        // loop to access array element (we assume first index is at sorted position)
        for (int lastUnsortedIndex = 1; lastUnsortedIndex < arr.length; lastUnsortedIndex++) {
            int newElement = arr[lastUnsortedIndex];

            // loop to compare array elements
            int i;
            for (i = lastUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--)
                arr[i] = arr[i - 1];

            arr[i] = newElement;
        }

        System.out.println("Sorted arr: " + Arrays.toString(arr));
    }
}