package org.example;

public class UppercaseStringsChallenge {

    /*
     * 🚀 Java Coding Challenge: Convert an Array of Strings to All Uppercase
     *
     * Instructions:
     * Implement the method below:
     *    public static String[] toUppercaseArray(String[] arr)
     *
     * - Given an array of strings, return a new array where each string
     *   is converted to uppercase.
     * - If the input array is empty, return an empty array.
     *
     * Example:
     *    arr = ["hello", "world"]
     *    result = ["HELLO", "WORLD"]
     *
     * Once implemented, run the main method to verify your solution
     * with a few test cases.
     */

    public static void main(String[] args) {
        test(new String[]{"hello", "world"}, new String[]{"HELLO", "WORLD"});
        test(new String[]{}, new String[]{});
        test(new String[]{"TeSt", "123", "java"}, new String[]{"TEST", "123", "JAVA"});
    }

    // TODO: Implement this method
    public static String[] toUppercaseArray(String[] arr) {
        return null; // Replace with your implementation
    }

    // Test helper method, do not modify
    public static void test(String[] input, String[] expected) {
        String[] result = toUppercaseArray(input);
        if (java.util.Arrays.equals(result, expected)) {
            System.out.println("✅ Test passed");
        } else {
            System.out.println("❌ Test failed");
            System.out.println("Expected: " + java.util.Arrays.toString(expected));
            System.out.println("Got     : " + java.util.Arrays.toString(result));
        }
    }
}
