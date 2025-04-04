package org.example;

public class MergeSortedArraysChallenge {

    /*
     * 🚀 Java Coding Challenge: Merge Two Sorted Arrays
     *
     * Instructions:
     * Implement the method below:
     *    public static int[] mergeSortedArrays(int[] a, int[] b)
     *
     * - Merge two sorted arrays `a` and `b` into one sorted array in ascending order.
     * - Do not use built-in sort methods like Arrays.sort().
     * - The input arrays are already sorted.
     * - Return a new sorted array containing all elements from both arrays.
     * - Handle edge cases like one or both arrays being empty.
     *
     * Example:
     *    a = [1, 3, 5], b = [2, 4, 6]
     *    result = [1, 2, 3, 4, 5, 6]
     *
     * Once implemented, run the main method to verify your solution with a few test cases.
     */

    public static void main(String[] args) {
        // Sample test cases. You should not modify these.
        test(new int[]{1, 3, 5}, new int[]{2, 4, 6}, new int[]{1, 2, 3, 4, 5, 6});
        test(new int[]{1, 2, 3}, new int[]{}, new int[]{1, 2, 3});
        test(new int[]{}, new int[]{4, 5, 6}, new int[]{4, 5, 6});
        test(new int[]{1, 1, 1}, new int[]{1, 1}, new int[]{1, 1, 1, 1, 1});
        test(new int[]{}, new int[]{}, new int[]{});
    }

    // TODO: Implement this method
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        return null; // Replace this with your implementation
    }

    // Test helper method, do not modify
    public static void test(int[] a, int[] b, int[] expected) {
        int[] result = mergeSortedArrays(a, b);
        if (java.util.Arrays.equals(result, expected)) {
            System.out.println("✅ Test passed");
        } else {
            System.out.println("❌ Test failed");
            System.out.println("Expected: " + java.util.Arrays.toString(expected));
            System.out.println("Got     : " + java.util.Arrays.toString(result));
        }
    }
}
