package com.harxsh.arrays.remove.duplicate;

/*
 * Using Frequency array
 * We can use the frequency array if the number in the array is limited,
 *  or we can also use a set or map interface to remove duplicates if the range of numbers in the array is too large.
 *
 * Approach:
 * 1. Find the Maximum element (m) in the array
 * 2. Create a new array of size m + 1
 * 3. Now traverse the input array and count the frequency of every element in the input array.
 * 4. Now traverse the frequency array and check for the frequency of every number
 *  if the frequency of the particular element is greater than 0 then print the number.
 *
 * Note: The method will not be useful if the number is greater than 1000000 or if the array is of strings.
 */

import java.util.Arrays;

public class Method4 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 6, 3, 2, 6, 7, 9, 0, 1, 4};

        // m will have the maximum element in the array
        int m = 0;

        for (int val : arr)
            m = Math.max(m, val);

        System.out.println("m: " + m);

        // creating the frequency array
        int[] f = new int[m + 1];

        // initializing the f[] with 0
        for (int i = 0; i < m + 1; i++)
            f[i] = 0;

        System.out.println("f: " + Arrays.toString(f));

        // increasing the value at a[i]th index in the frequency array
        for (int val : arr) f[val]++;

        System.out.println("f again: " + Arrays.toString(f));

        for (int i = 0; i < m + 1; i++) {
            // if the frequency of the particular element is greater than 0, then print it
            if (f[i] > 0)
                System.out.println(i);
        }
    }
}
