package com.autoramming.core.controlflows;

public class ConditionalFlow {

    public static void main(String[] args) {
        // Conditional flow:
        // If-else statement
        // Switch statement
        // Ternary operator

        // If-else statement
        int num = 10;
        if (num > 0) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Ternary operator
        int age = 18;
        String message = (age >= 18) ? "You are an adult" : "You are not an adult";
        System.out.println(message);
    }
}
