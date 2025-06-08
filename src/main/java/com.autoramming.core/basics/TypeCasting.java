package com.autoramming.core.basics;

public class TypeCasting {
    public static void main(String[] args) {
        // Type casting is the process of converting variable's one data type to another data type.
        // There are two types of type casting:

        // 1. Implicit (Widening) type casting
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        // It's SAFE because there is no risk of data loss

        // 2. Explicit (Narrowing) type casting
        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        // It's UNSAFE because there is a risk of data loss, data might be truncated

        // Widening Casting (implicit)
        int intValue = 10;
        double doubleValue = intValue; // int is automatically converted to double
        System.out.println(doubleValue); // Output: 10.0

        // Narrowing Casting (explicit)
        double anotherDoubleValue = 10.99;
        int anotherIntValue = (int) anotherDoubleValue; // double is explicitly cast to int
        System.out.println(anotherIntValue); // Output: 10 (decimal part is truncated)

        // Real time example
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
    }
}
