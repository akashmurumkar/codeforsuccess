package com.autoramming.core.questions;

public class CountString {

    public static void main(String[] args) {
        String str = "Hello World! This is a test.";
        System.out.println(countWordsInString(str)); // Output: 5
        System.out.println(countLowercaseAndUppercase(str)); // Output: Count of Uppercase: 3 and Count of Lowercase: 18
        System.out.println(countSpecialCharacters(str)); // Output: Count of special characters: 7
        System.out.println(countDigitsInString(str)); // Output: Count of Digits: 1
        System.out.println();
    }

    static String countDigitsInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return "Count of Digits: " + count;
    }

    static String countSpecialCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                count++;
            }
        }
        return "Count of special characters: " + count;
    }

    static String countLowercaseAndUppercase(String str) {
        int lowercase = 0;
        int uppercase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowercase++;
            }
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                uppercase++;
            }
        }
        return "Count of Uppercase: " + uppercase + " and Count of Lowercase: " + lowercase;
    }

    public static int countWordsInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }



}
