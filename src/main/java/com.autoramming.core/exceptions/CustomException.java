package com.autoramming.core.exceptions;

public class CustomException {

    // Custom exception
    // A custom exception is a user-defined exception that extends the Exception class or one of its subclasses.

    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Throwable {
    public MyException(String message) {
        super(message);
    }
}

// Questions and answers on custom exceptions

// 1. What is a custom exception?
// A custom exception is a user-defined exception that extends the Exception class or one of its subclasses.

// 2. How do you create a custom exception?
// You can create a custom exception by extending the Exception class or one of its subclasses.

// 3. What is the purpose of a custom exception?
// The purpose of a custom exception is to provide a way to handle specific errors in your code.
