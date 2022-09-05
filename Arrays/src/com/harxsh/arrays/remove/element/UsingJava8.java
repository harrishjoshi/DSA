package com.harxsh.arrays.remove.element;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UsingJava8 {

    // function to remove element
    public static int[] removeTheElement(int[] arr, int index) {
        // if the array is empty or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length)
            return arr;

        // return the resultant array
        return IntStream.range(0, arr.length)
                .filter(i -> i != index)
                .map(i -> arr[i])
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {16, 4, 6, 57, 89, 5, 34};
        System.out.println("Original Arr: " + Arrays.toString(arr));

        // index to be removed
        int index = 0;
        System.out.println("Index to be removed: " + index);

        // remove the element
        arr = removeTheElement(arr, index);

        System.out.println("Resultant Arr: " + Arrays.toString(arr));
    }
}
