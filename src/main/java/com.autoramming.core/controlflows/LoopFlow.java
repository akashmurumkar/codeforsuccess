package com.autoramming.core.controlflows;

public class LoopFlow {

    public static void main(String[] args) {
        // Loop flow:
        // While loop - repeats a block of code until a certain condition is met
        // Do-while loop - first executes a block of code and then repeats a block of code until a certain condition is met
        // For loop - repeats a block of code a certain number of times
        // Enhanced for loop - shorter syntax for iterating over an array, list, or collection

        // While loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Do-while loop
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        // For loop
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }

        // Enhanced for loop
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
