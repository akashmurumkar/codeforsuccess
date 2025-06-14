package com.autoramming.core.exceptions;

public class UncheckedException {

    public static void main(String[] args) {
        // Unchecked exceptions:
        // Exceptions that do not need to be caught and handled
        // They can be thrown by the code
        // Example: NullPointerException, ArrayIndexOutOfBoundsException, etc.
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]);
    }

    // Questions and answers:
    // 1. What is the difference between checked and unchecked exceptions?
    // Answer: Checked exceptions must be caught and handled, while unchecked exceptions do not need to be caught and handled.

    // 2. What is the difference between NullPointerException and ArrayIndexOutOfBoundsException?
    // Answer: NullPointerException is thrown when a null reference is used, while ArrayIndexOutOfBoundsException is thrown when an index is out of bounds in an array.

    // 3. What is the difference between StackOverflowError and OutOfMemoryError?
    // Answer: StackOverflowError is thrown when the Java virtual machine (JVM) runs out of stack space, while OutOfMemoryError is thrown when the JVM runs out of memory.

    // 4. IllegalStateException vs IllegalArgumentException
    // Answer: IllegalStateException is thrown when the state of the program is not valid, while IllegalArgumentException is thrown when the arguments passed to a method are not valid.


    // 5. What is the difference between RuntimeException and Exception?
    // Answer: RuntimeException is a subclass of Exception, while Exception is a subclass of Throwable.
    // RuntimeException is thrown by the Java runtime, while Exception is thrown by the user.

    // 6. What is the difference between Error and Exception?
    // Answer: Error is a subclass of Exception, while Exception is a subclass of Throwable.
    // Error is thrown by the Java runtime, while Exception is thrown by the user.
    // Error is a more serious exception than Exception, and is thrown in cases where the program cannot continue to run.

    // 7. What is the difference between Throwable and Exception?
    // Answer: Throwable is a superclass of Exception, while Exception is a subclass of Throwable.
    // Throwable is thrown by the Java runtime, while Exception is thrown by the user.
    // Throwable is a more general exception than Exception, and is thrown in cases where the program cannot continue to run.

    // 8. What is the difference between Throwable and Error?
    // Answer: Throwable is a superclass of Error, while Error is a subclass of Throwable.
    // Throwable is thrown by the Java runtime, while Error is thrown by the user.
    // Throwable is a more general exception than Error, and is thrown in cases where the program cannot continue to run.

    // 9. throw and throws
    // Answer: throw is used to throw an exception, while throws is used to declare that a method may throw an exception.


}
