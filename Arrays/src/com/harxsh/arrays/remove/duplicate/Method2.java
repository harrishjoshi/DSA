package com.harxsh.arrays.remove.duplicate;

/*
 * Constant extra space (can be used if the array is sorted)
 * Just maintain a separate index for the same array as maintained for different array in method 1.
 */

public class Method2 {

    public static int removeDuplicates(int[] arr, int arrLen) {
        // if array length is 0 or 1, then array is already sorted
        if (arrLen == 0 || arrLen == 1)
            return arrLen;

        // keeps count of unique elements
        int j = 0;

        // check if the ith element is not equal to the (i + 1)th element,
        // if not then add that element at the jth index in the same array
        // which indicates that the particular element will only be added once in the array
        for (int i = 0; i < arrLen - 1; i++) {
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];
        }

        // copy last element to unique index
        arr[j++] = arr[arrLen - 1];

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5};
        int arrLen = arr.length;

        // the function will modify the array arr[]
        // such that the starting j elements wll be having all unique elements
        // and no element will be appearing more than once
        int j = removeDuplicates(arr, arrLen);
        // printing the unique array elements
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
     * Time complexity: O(n)
     * Auxiliary Space: O(1) (is the extra space or temp space used by an algorithm)
     *
     * Note: When array is not sorted, the sorting of the array is done using this method
     * then the time complexity of the program increases from O(n) to O(nlogn)
     */
}
