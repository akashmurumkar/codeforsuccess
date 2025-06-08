package com.autoramming.core.questions;

/**
 * Question:
 * 1. Anagram - Two strings are anagrams if they contain the same characters but in different order
 * 2. Palindrome - A string is a palindrome if it reads the same forward and backward
 * 3. Remove Duplicates - Given a string, remove the duplicate characters
 */

public class RandomString {

    static final int MAX_CHAR = 26;

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));

        String s3 = "nitin";
        System.out.println(isPalindrome(s3));

        String s4 = "Hello World! This is a test.";
        System.out.println(removeDuplicateCharacters(s4));
    }

    static boolean isAnagram(String s1, String s2) {
        int[] freq = new int[MAX_CHAR];

        // Count frequency of each character in string s1
        for (int i = 0; i < s1.length(); i++)
            freq[s1.charAt(i) - 'a']++;

        // Count frequency of each character in string s2
        for (int i = 0; i < s2.length(); i++)
            freq[s2.charAt(i) - 'a']--;

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }

    static boolean isPalindrome(String s) {
        // Convert string to lowercase for case-insensitive comparison
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Compare the original string with the reversed string
        return s.equals(rev);
    }

    static String removeDuplicateCharacters(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        boolean[] seen = new boolean[256];

        // Traverse through all characters
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if s[i] is present before it
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }

        return sb.toString();
    }

}
