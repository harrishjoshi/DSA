package com.harxsh.recursion;

public class Main {

    public static void main(String[] args) {
        System.out.println("Recursive Factorial: " + recursiveFactorial(5));
        System.out.println("Iterative Factorial: " + iterativeFactorial(5));
    }

    /*
     * 1! = 1 * 0! = 1
     * 2! = 2 * 1 = 2 * 1!
     * 3! = 3 * 2 * 1 = 3 * 2!
     * 4! = 4 * 3 * 2 * 1 = 4 * 3!
     * ...
     * n! = n * (n - 1) !
     */

    public static int recursiveFactorial(int num) {
        if (num == 0)
            return 1;

        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num) {
        if (num == 0)
            return 1;

        int factorial = 1;

        for (int i = 1; i <= num; i++)
            factorial *= i;

        return factorial;
    }
}