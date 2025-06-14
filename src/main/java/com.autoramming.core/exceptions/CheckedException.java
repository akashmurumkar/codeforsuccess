package com.autoramming.core.exceptions;

public class CheckedException {

    public static void main(String[] args) {
        // Checked exceptions:
        // Exceptions that need to be caught and handled
        // They can be thrown by the code
        // Example: IOException, SQLException, etc.
        try {
            // Code that may throw an exception
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Code that will be executed regardless of whether an exception is thrown or not
            System.out.println("Finally block executed");
        }
    }

    // Questions and Answers for Checked Exceptions:
    // 1. What is a checked exception in Java?
    // Answer: A checked exception is an exception that must be caught and handled by the code.

    // 2. Why are checked exceptions important?
    // Answer: Checked exceptions help ensure that the code is robust and can handle unexpected errors.

    // 3. How do you handle a checked exception in Java?
    // Answer: You can use a try-catch block to handle the exception.

    // 4. What is the finally block in Java?
    // Answer: The finally block is a block of code that will be executed regardless of whether an exception is thrown or not.

    // 5. What is the difference between a checked and unchecked exception in Java?
    // Answer: A checked exception is an exception that must be caught and handled by the code, while an unchecked exception is an exception that does not need to be caught and handled by the code.

    // 6. What is the try-with-resources statement in Java?
    // Answer: The try-with-resources statement is a new feature in Java 7 that allows you to automatically close resources after they have been used.

    // 7. finally vs garbage collector
    // Answer: The finally block is executed regardless of whether an exception is thrown or not, while the garbage collector is responsible for cleaning up resources that are no longer needed.

    // 8. Stop finally block
    // Answer: You can use the return statement to stop the execution of the finally block.

}
