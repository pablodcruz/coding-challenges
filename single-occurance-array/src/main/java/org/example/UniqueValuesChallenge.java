package org.example;

import java.util.HashMap;
import java.util.Map;

public class UniqueValuesChallenge {

    /*
     * 🚀 Java Coding Challenge: Find Values That Occur Only Once
     *
     * Instructions:
     * Implement the method below:
     *    public static int[] findUniqueValues(int[] arr)
     *
     * - Given an array of integers, return an array containing
     *   only those integers that appear exactly once in the input array.
     * - The order of the unique values in the result should match the order
     *   they first appear in the input array.
     * - If no values occur exactly once, return an empty array.
     *
     * Example:
     *    arr = [1, 2, 2, 3, 4, 4, 5]
     *    result = [1, 3, 5]  (only 1, 3, and 5 appear exactly once)
     *
     * Once implemented, run the main method to verify your solution
     * with a few test cases.
     */

    public static void main(String[] args) {
        test(new int[]{1, 2, 2, 3, 4, 4, 5}, new int[]{1, 3, 5});
        test(new int[]{10, 10, 10}, new int[]{});
        test(new int[]{7, 8, 9}, new int[]{7, 8, 9});
        test(new int[]{}, new int[]{});
        test(new int[]{2, 2, 2, 3, 3, 3}, new int[]{});
    }

    // TODO: Implement this method
    public static int[] findUniqueValues(int[] arr) {
        return null; // Replace with your implementation
    }

    // Test helper method, do not modify
    public static void test(int[] input, int[] expected) {
        int[] result = findUniqueValues(input);
        if (java.util.Arrays.equals(result, expected)) {
            System.out.println("✅ Test passed");
        } else {
            System.out.println("❌ Test failed");
            System.out.println("Expected: " + java.util.Arrays.toString(expected));
            System.out.println("Got     : " + java.util.Arrays.toString(result));
        }
    }
}
