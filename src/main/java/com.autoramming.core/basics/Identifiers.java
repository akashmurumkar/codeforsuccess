package com.autoramming.core.basics;

public class Identifiers {

    public static void main(String[] args) {
        // Identifiers:
        // Variable names
        // Class names
        // Method names
        // Package names
        // Interface names
        // Exception names

        // Identifier naming conventions:
        // 1. Start with letter (a-z, A-Z), an underscore (_), or a dollar sign ($)
        // 2. Cannot start with a digit (0-9)
        // 3. Can contain letters, digits, underscores, and dollar signs
        // 4. Must be unique within the scope of the identifier
        // 5. Case-sensitive (myVariable and myvariable are different identifiers)

        // Examples of valid identifiers:
        int myVariable = 10;
        String name = "John Doe";
        int _myVariable = 20;
        int $myVariable = 30;
        int my_variable = 40;

        // Examples of invalid identifiers:
        // int 10myVariable = 50;
        // int my-variable = 60;
        // int my variable = 70;

        // Variable names example
        int age = 10;
        String person = "John Doe";

        // Class names example
        Identifiers identifiersExample = new Identifiers();

        // Method names example
        printMessage();

        // Package names example
        Primitive primitiveExample = new Primitive();

        // Interface names example
        Runnable myRunnable = new Runnable() {
            public void run() {
                System.out.println("Running...");
            }
        };

        // Exception names example
        try {
            throw new Exception("Example Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void printMessage() {
        System.out.println("This is a static method example.");
    }

}
