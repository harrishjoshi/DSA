package com.harxsh.arrays.remove.duplicate;

/*
 * Using HashMap
 *
 * Approach:
 * 1. Create a HashMap to store the unique elements.
 * 2. Traverse the array
 * 3. Check if the element is present in the HashMap.
 * 4. If yes, continue traversing the array.
 * 5. Else print the element and store the element in HashMap
 */

import java.util.HashMap;

public class Method5 {

    public static void removeDuplicates(int[] arr, int arrLen) {
        // HashMap which will store the elements which has appeared
        HashMap<Integer, Boolean> elementsMap = new HashMap<>();

        for (int i = 0; i < arrLen; i++) {
            // print the element if it is not present there in the HashMap
            // and insert the element in the HashMap
            int currentVal = arr[i];
            if (elementsMap.get(currentVal) == null) {
                System.out.println(currentVal);
                elementsMap.put(currentVal, true);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 6, 6, 7, 9, 0, 1, 4};
        int arrLen = arr.length;
        removeDuplicates(arr, arrLen);
    }
}
