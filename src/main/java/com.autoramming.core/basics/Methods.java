package com.autoramming.core.basics;

public class Methods {

    public static void main(String[] args) {
        // Methods
        // A method is a block of code that performs a specific task or action
        // A method can take input parameters and return a value
        // A method can also have default parameters
        // A method can be overloaded and overridden
        // A method can be abstract, final, static, synchronized, native, throws, varargs

        // Method naming conventions:
        // 1. Start with a lowercase letter (a-z)
        // 2. Can contain letters, digits, and underscores
        // 3. Cannot start with a digit (0-9)
        // 4. Cannot be a keyword
        // 5. Must be unique within the scope of the class

        // About **main** method:
        // The main method is the entry point of a Java program
        // It is the first method to be executed when the program is run
        // It takes an array of strings as input
        // It is a static method, so it belongs to the class
        // It is a void method, so it does not return a value

        // About **void** method:
        // A void method is a method that does not return a value
        // It is a void method, so it does not return a value

        // About System.exit() method:
        // The System.exit() method is used to terminate a Java program
        // It takes an integer as input
        // Examples:
        // System.exit(0); // Exit with success status
        // System.exit(1); // Exit with failure status

        // Passing parameter like String... means that the method can take any number of String parameters
        // Examples:
        printMessage("Hello", "World");

    }

    // Method declaration:
    public void myMethod() {
        // Method body
    }

    // Examples of valid method names:
    public void printMessage() {
        System.out.println("Hello, world!");
    }

    public void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("Area: " + area);
    }

    // Examples of invalid method names:
    // public void 10printMessage() {
    //     System.out.println("Hello, world!");
    // }

    // Duplicate method:
    // public void calculateArea(int length, int width) {
    //     int area = length * width;
    //     System.out.println("Area: " + area);
    // }

     public static void printMessage(String... messages) {
         for (String message : messages) {
             System.out.println(message);
         }
     }
}
