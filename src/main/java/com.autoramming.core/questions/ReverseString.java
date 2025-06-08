package com.autoramming.core.questions;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World! This is a test.";
        System.out.println(reverseStringByChar(str)); // Output: "dlroW olleH"
        System.out.println(reverseStringByWord(str));  // Output: "World Hello"
        System.out.println(reverseStringEachWordInSamePlace(str)); // Output: "olleH dlroW"
        System.out.println(reverseByRecursion(str)); // Output: "dlroW olleH"
    }

    static String reverseStringByChar(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    static String reverseStringByWord(String str) {
        String[] words = str.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        return reversed;
    }

    static String reverseStringEachWordInSamePlace(String str) {
        String[] words = str.split(" ");
        String reversed = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }

            reversed += reversedWord + " ";
        }

        return reversed;
    }

    static String reverseByRecursion(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseByRecursion(str.substring(1)) + str.charAt(0);
    }

}
