package com.harxsh.arrays.remove;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UsingArrayList {

    // function to remove element
    public static int[] removeTheElement(int[] arr, int index) {
        // if the array is empty or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length)
            return arr;

        /// create the ArrayList from the array
        List<Integer> arrList = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());

        // remove the specified array
        arrList.remove(index);

        return arrList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 6, 57, 9, 51, 34};
        System.out.println("Original Arr: " + Arrays.toString(arr));

        // index to be removed
        int index = 5;
        System.out.println("Index to be removed: " + index);

        // remove the element
        arr = removeTheElement(arr, index);

        System.out.println("Resultant Arr: " + Arrays.toString(arr));
    }
}
