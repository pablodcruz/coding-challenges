package org.example;

/*
 * 🚀 Java Coding Challenge: Write a Class with Static and Instance Methods
 *
 * Instructions:
 * 1. Create a class named MyUtility:
 *    - It should have:
 *       a) A static method: public static int add(int a, int b)
 *          - returns the sum of a and b.
 *       b) An instance method: public String greet(String name)
 *          - returns a greeting message for the given name.
 * 2. In the main method below, you will create an instance of MyUtility to test the greet method.
 *    You will also directly call the static method add(...) without needing an instance.
 *
 * 3. Write the logic for both methods in MyUtility. Test them by verifying the output.
 *
 * Example:
 *  - MyUtility.add(2, 3) returns 5
 *  - new MyUtility().greet(\"Alice\") returns \"Hello, Alice!\"
 *
 * Once implemented, run the main method and see if it prints the expected results.
 */
public class StaticInstanceMethodsChallenge {

    public static void main(String[] args) {
        // Test the static method
        int sumResult = MyUtility.add(2, 3);
        if (sumResult == 5) {
            System.out.println("✅ add(2, 3) = 5, Test Passed");
        } else {
            System.out.println("❌ add(2, 3) Expected 5, but got " + sumResult);
        }

        // Test the instance method
        MyUtility util = new MyUtility();
        String greeting = util.greet("Alice");
        if (greeting.equals("Hello, Alice!")) {
        System.out.println("✅ Hello, Alice!, Test Passed");
    } else {
        System.out.println("❌ greet('Alice') Expected " + "Hello, Alice! " + "but got "+ greeting);
    }
}
}


// TODO: Implement this class
class MyUtility {
    // 1) Static method: add(int a, int b)
    // 2) Instance method: greet(String name)
}

