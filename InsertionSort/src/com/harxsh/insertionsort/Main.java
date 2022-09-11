package com.harxsh.insertionsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted arr: " + Arrays.toString(arr));

        /*
         * Working:
         * 1. The first element in the array is assumed to be sorted.
         * Take the second element and store it separately in newElement.
         *  Compare newElement with the first element. If the first element is greater than newElement,
         *  then newElement is placed in front of the first element.
         * 2. Now, the first two elements are sorted.
         *  Take the third element and compare it with the elements on the left of it.
         *  placed it just behind the element smaller than it. If there is no element smaller than it,
         *  then place it at the beginning of the array.
         * 3. Similarly, place every unsorted element at its correct position.
         */

        // loop to access array element (we assume first index is at sorted position)
        for (int lastUnsortedIndex = 1; lastUnsortedIndex < arr.length; lastUnsortedIndex++) {
            int newElement = arr[lastUnsortedIndex];

            // loop to compare array elements
            int i;
            for (i = lastUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--)
                arr[i] = arr[i - 1];

            // place newElement at after the element just smaller than it
            arr[i] = newElement;
        }

        System.out.println("Sorted arr: " + Arrays.toString(arr));

        /*
         * Stability in Sorting Algorithms:
         * The stability of a sorting algorithm is concerned with how the algorithm treats equal (or repeated) elements.
         * Stable sorting algorithm preserve the relative order of equal elements, while unstable sorting algorithms don't.
         * In other words stable sorting maintains the position of two equals elements relative to one another.
         */
    }
}