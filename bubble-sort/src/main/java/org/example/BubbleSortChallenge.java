package org.example;

public class BubbleSortChallenge {

    /*
     * 🚀 Java Coding Challenge: Bubble Sort an Array
     *
     * Instructions:
     * Implement the method below:
     *    public static void bubbleSort(int[] arr)
     *
     * - Sort the input array `arr` in-place using the Bubble Sort algorithm.
     * - Bubble Sort compares each pair of adjacent elements and swaps them
     *   if they are in the wrong order.
     * - Repeat this process until the entire array is sorted in ascending order.
     * - Do not use built-in sort methods like Arrays.sort().
     * -
     * Example:
     *    Input:  [5, 1, 4, 2, 8]
     *    Output: [1, 2, 4, 5, 8]
     *
     * Once implemented, run the main method to verify your solution with the test cases provided.
     * Bubble Sort Algorithm Visualized: https://www.youtube.com/watch?v=nmhjrI-aW5o
     */

    public static void main(String[] args) {
        // Sample test cases. You should not modify these.
        test(new int[]{5, 1, 4, 2, 8}, new int[]{1, 2, 4, 5, 8});
        test(new int[]{}, new int[]{});
        test(new int[]{1}, new int[]{1});
        test(new int[]{3, 3, 2, 1}, new int[]{1, 2, 3, 3});
        test(new int[]{9, 7, 5, 3, 1}, new int[]{1, 3, 5, 7, 9});
    }

    // TODO: Implement this method
    public static void bubbleSort(int[] arr) {
        // Replace this comment with your code

    }

    // Test helper method, do not modify
    public static void test(int[] input, int[] expected) {
        int[] copy = java.util.Arrays.copyOf(input, input.length);
        bubbleSort(copy);
        if (java.util.Arrays.equals(copy, expected)) {
            System.out.println("✅ Test passed");
        } else {
            System.out.println("❌ Test failed");
            System.out.println("Input   : " + java.util.Arrays.toString(input));
            System.out.println("Expected: " + java.util.Arrays.toString(expected));
            System.out.println("Got     : " + java.util.Arrays.toString(copy));
        }
    }
}
