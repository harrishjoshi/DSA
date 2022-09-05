package com.harxsh.arrays.remove.duplicate;

/*
 * Using extra space (can be used if the array is sorted)
 * 1. Create a temp array temp[] to store unique elements
 * 2. Traverse input array and copy all the unique elements of arr[] to temp[].
 * Also, keep count of unique elements.
 * 3. Copy j elements from temp[] to arr[].
 * Note: This approach is applicable when the array is sorted.
 */

public class Method1 {

    public static int removeDuplicates(int[] arr, int arrLen) {
        // if array length is 0 or 1, then array is already sorted
        if (arrLen == 0 || arrLen == 1)
            return arrLen;

        // creating another array for storing unique elements
        int[] temp = new int[arrLen];
        // j keeps count of unique elements
        int j = 0;

        for (int i = 0; i < arrLen - 1; i++) {
            // checking if current element and subsequent element are same or not,
            // if not add to unique array i.e. temp[]
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        }

        // copying last element to unique array
        temp[j++] = arr[arrLen - 1];

        // changing the original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int arrLen = arr.length;
        // returns unique array count
        arrLen = removeDuplicates(arr, arrLen);
        // printing the unique array elements
        for (int i = 0; i < arrLen; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
     * Time complexity: O(n)
     * Auxiliary Space: O(n) (is the extra space or temp space used by an algorithm)
     *
     * Note: When array is not sorted, the sorting of the array is done using this method
     * then the time complexity of the program increases from O(n) to O(nlogn)
     */
}
