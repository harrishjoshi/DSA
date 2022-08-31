package com.harxsh.arrays.remove;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsingAnotherArray {

    // function to remove element
    public static int[] removeTheElement(int[] arr, int index) {
        // if the array is empty or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index >= arr.length)
            return arr;

        // create a new array with size 1 less
        int[] newArr = new int[arr.length - 1];
        int newArrIndex = 0;

        // copy the element except the index
        // from original array to te other array
        for (int i = 0; i < arr.length; i++) {
            // if the index is the removal element index
            // then skip loop
            if (i == index)
                continue;

            // if the index is not the removal element copy into new array
            newArr[newArrIndex++] = arr[i];
        }

        // return the resultant array
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 89, 34};
        System.out.println("Original Arr: " + Arrays.toString(arr));

        // index to be removed
        int index = 3;
        System.out.println("Index to be removed: " + index);

        // remove the element
        arr = removeTheElement(arr, index);

        System.out.println("Resultant Arr: " + Arrays.toString(arr));
    }
}
