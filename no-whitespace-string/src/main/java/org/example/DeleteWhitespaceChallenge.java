package org.example;

public class DeleteWhitespaceChallenge {

    /*
     * 🚀 Java Coding Challenge: Delete Whitespace in a String
     *
     * Instructions:
     * Implement the method below:
     *    public static String removeWhitespace(String input)
     *
     * - Given a string, remove all whitespace characters (' ', '\\t', '\\n') from it.
     * - Return the resulting string.
     * - If the string is empty or null, return it as is (or handle null appropriately).
     *
     * Example:
     *    input = \"  Hello   World\\n  \"
     *    result = \"HelloWorld\"
     *
     * Once implemented, run the main method to verify your solution
     * with a few test cases.
     */

    public static void main(String[] args) {
        test("  Hello   World  ", "HelloWorld");
        test("", "");
        test("NoSpace", "NoSpace");
        test("   a   b c ", "abc");
        test(null, null);  // Decide how you want to handle null
    }

    // TODO: Implement this method
    public static String removeWhitespace(String input) {
        return null; // Replace with your implementation
    }

    // Test helper method, do not modify
    public static void test(String input, String expected) {
        String result = removeWhitespace(input);
        boolean bothNull = (input == null && expected == null);
        if (bothNull || (result != null && result.equals(expected))) {
            System.out.println("✅ Test passed");
        } else {
            System.out.println("❌ Test failed");
            System.out.println("Expected: " + expected);
            System.out.println("Got     : " + result);
        }
    }
}
