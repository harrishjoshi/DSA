package com.harxsh.arrays;

public class Main {

    /*
     * Arrays:
     * 1. Contiguous block of memory
     * 2. Every element occupies the same amount of space in memory
     * 3. If an array starts at memory address x, and the size of each element in the array is y,
     *   we can calculate the memory address of the ith element by using the following expression: x + i * y
     * 4. If we know the index of element, the time to retrieve the element will be the same,
     *   no matter where it is in the array
     */

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        // starts iterating from 20 or index 0
        // and ends at -22 or index 6 which is last valid index in this scenario
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // find index of number
        // initially index is -1 which represent number is not in the array
        int index = -1;
        int number = 7;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == number) {
                index = i;
                break;
            }
        }

        System.out.println("Index of " + number + " => " + index);
    }

    /*
     *  Retrieve an element from an array:
     *  1. Multiply the size of the element by its index
     *  2. Get the start address of the array
     *  3. Add the start address to the result of the multiplication
     */

    /*
     * Time complexity
     * 1. Retrieve with index => O(1) - Constant time
     * 2. Retrieve without index => O(n) - Linear time
     * 3. Add an element to a full array => O(n)
     * 4. Add an element to the end of an array (has space) => O(1)
     * 5. Insert or update an element at a specific index => O(1)
     * 6. Delete an element by setting it to null => O(1)
     * 7. Delete an element by shifting elements => O(n)
     */
}