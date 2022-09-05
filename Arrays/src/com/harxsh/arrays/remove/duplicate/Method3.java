package com.harxsh.arrays.remove.duplicate;

/*
 * Using Set (can be used even if the array is not sorted)
 * 1. Take a set
 * 2. Insert all array elements in the set. Set does not allow duplicates
 *  and sets like LinkedHashSet maintains the order of insertion,
 *  so it will remove duplicates and elements will remain in the same order in which it is inserted.
 */

import java.util.LinkedHashSet;

public class Method3 {

    // function to remove duplicate from array
    public static void removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();

        // adding elements to LinkedHashSet
        for (int val : arr)
            uniqueElements.add(val);

        // print the element of LinkedHashSet
        System.out.println(uniqueElements);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 2, 5, 7, 8, 9, 2, 4, 6, 8};
        removeDuplicates(arr);
    }
}
