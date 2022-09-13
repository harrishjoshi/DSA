package com.harxsh.shellsort;

import java.util.Arrays;

public class Main {

    /*
     * Shell sort is a generalized version of the insertion and bubble sort algorithm.
     * It first sorts elements that are far apart from each other and successively reduces the interval between
     * the elements to be sorted.
     *
     * The interval between the elements is reduced based on the sequence used.
     * There are multiple sequences that can be used in the shell sort algorithm.
     * Shell's original sequence: N/2, N/4, ..., 1
     * Knuth's increments: 1, 4, 13, ...; (3^k - 1)/2; where k is length of array
     * .
     * .
     * .
     * Note: The performance of the shell sort depends on the ype of sequence used for a given input array.
     *
     * Working:
     * 1. Suppose, we need to sort this: {20, 35, -15, 7, 55, 1, -22} array.
     * 2. We are using the shell's original sequence (N/2, N/2, ...1)as intervals in our algorithm.
     * In the first loop, if the array length is N = 7 then,
     * the elements lying at the interval of N/2 = 3 are compared and swapped if they are not in order.
     * a. The 0th element is compared with the 3rd element.
     * b. If the 0th element is greater than the 3rd one then, the 3rd element is first stored in temp variable
     * and the 0th element(i.e. greater element) is stored in the 3rd position
     * and the element stored in temp is stored in the 0th position.
     * This process goes on for all the remaining elements.
     * 3. In the second loop, an interval of N/4 = 7/4 = 1 is taken
     * and again the elements lying at these intervals are sorted.
     * 4. The same process goes on.
     */

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted arr: " + Arrays.toString(arr));

        // Rearrange elements at each n/2, n/4, n/8, ... intervals
        // This is the interval sequence.
        for (int interval = arr.length / 2; interval > 0; interval /= 2) {
            // do a gap insertion sort for this interval size
            for (int i = interval; i < arr.length; i++) {
                // store arr[i] to the temp variable and make the ith position empty
                int temp = arr[i];
                // store the arr[i] correct position (initial same as current position)
                int j = i;

                // compare and swap if elements are not in correct orders
                while (j >= interval && arr[j - interval] > temp) {
                    arr[j] = arr[j - interval];
                    j -= interval;
                }

                // put temp (the original arr[i] in its correct position)
                arr[j] = temp;
            }
        }

        System.out.println("Sorted arr: " + Arrays.toString(arr));
    }
}