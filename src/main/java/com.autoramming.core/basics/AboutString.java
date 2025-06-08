package com.autoramming.core.basics;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class AboutString {

    /**
     * String is a class in Java that represents a sequence of characters.
     * It is a non-primitive data type and is immutable, meaning it cannot be modified once it is created.
     * <p>
     * String methods:
     * - charAt(index): Returns the character at the specified index.
     * - length(): Returns the length of the string.
     * - equals(other): Returns true if the string is equal to the other string.
     * - startsWith(prefix): Returns true if the string starts with the specified prefix.
     * - endsWith(suffix): Returns true if the string ends with the specified suffix.
     * - indexOf(substring): Returns the index of the first occurrence of the specified substring.
     * - lastIndexOf(substring): Returns the index of the last occurrence of the specified substring.
     * - substring(startIndex): Returns a substring of the string starting from the specified index.
     * - substring(startIndex, endIndex): Returns a substring of the string starting from the specified index and ending at the specified index.
     * - replace(oldChar, newChar): Returns a new string with all occurrences of the specified character replaced with the new character.
     * - replace(oldString, newString): Returns a new string with all occurrences of the specified string replaced with the new string.
     * - split(separator): Returns an array of strings split by the specified separator.
     * - toCharArray(): Returns an array of characters representing the characters in the string.
     * - toLowerCase(): Returns a new string with all characters converted to lowercase.
     * - toUpperCase(): Returns a new string with all characters converted to uppercase.
     * - trim(): Returns a new string with leading and trailing whitespace removed.
     * - concat(otherString): Returns a new string that is the concatenation of this string and the specified string.
     * - intern(): Returns a new string that is the same as this string, but stored in the string pool.
     * - hashCode(): Returns the hash code value of the string.
     * - equals(other): Returns true if the string is equal to the other string.
     * <p>
     * String Pool:
     * In Java, the string pool is a memory area where strings are stored.
     * When a string is created, it is stored in the string pool.
     * If a string is created with the same value as another string,
     * the string will be stored in the same location in the string pool.
     * This means that if two strings have the same value, they will point to the same location in the string pool.
     * <p>
     * If a string is created with a different value,
     * it will be stored in a different location in the string pool.
     * This means that if two strings have different values, they will point to different locations in the string pool.
     * <p>
     * The string pool is a very efficient way to store strings in Java.
     * This is because it allows the JVM to reuse memory for strings that have the same value.
     * This can save a lot of memory and improve performance.
     * <p>
     * What is hashcode?
     * Hashcode is a unique number that is used to identify an object in memory.
     * It is used to store objects in the string pool.
     * <p>
     * Explain String is immutable:
     * String is immutable in Java, which means that once a string is created, it cannot be changed.
     * This is because the JVM stores the string in a read-only memory area.
     * <p>
     * Which classes can make String mutable?
     * - StringBuilder
     * - StringBuffer
     * <p>
     * StringBuilder and StringBuffer are mutable, which means that they can be changed after they are created.
     * This is because they store the string in a mutable memory area and faster than String which means that they are more efficient.
     * They were introduced in Java 5.
     * <p>
     * StringBuilder is not thread-safe, which means that it cannot be used concurrently by multiple threads.
     * StringBuffer is thread-safe, which means that they can be used concurrently by multiple threads.
     * <p>
     * StringBuilder is faster than StringBuffer because it is not synchronized.
     * StringBuffer is slower than StringBuilder because it is synchronized.
     */

    public static void main(String[] args) {
        printMessage("Hello world!");
        concatenation();
        indexing();
        substring();
        replace();
        length();
        equals();
        startsWith();
        endsWith();
        indexOf();
        lastIndexOf();
        toCharArray();
        toUpperCase();
        toLowerCase();
        trim();
        split();
        charAt();
        equalsIgnoreCase();
        replaceAll();
        replaceFirst();
        isEmpty();
        contains();
        compareTo();
        compareToIgnoreCase();
        stringBuilder();
        stringBuffer();
        stringFormat();
        immutableString();
        questions();
    }

    static void immutableString() {
        String name = "John";
        name = "Jane";
        System.out.println(name);

        StringBuilder nameBuilder = new StringBuilder("John");
        nameBuilder.append("Jane");
        System.out.println(nameBuilder);
    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    static void concatenation() {
        /**
         * + operator is used to concatenate strings.
         * concat() method is used to concatenate strings.
         */
        String name = "John";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        String name2 = "John";
        String greeting2 = name2.concat(" Doe");
        System.out.println(greeting2);
    }

    static void isEmpty() {
        /**
         * isEmpty() method is used to check if a string is empty.
         */
        String name = "";
        if (name.isEmpty()) {
            System.out.println("Name is empty.");
        }
    }

    static void indexing() {
        /**
         * charAt() method is used to get the character at a specific index in a string.
         */
        String firstName = "John";
        char firstLetter = firstName.charAt(0);
        System.out.println("The first letter of " + firstName + " is " + firstLetter);
    }

    static void substring() {
        /**
         * substring() method is used to extract a substring from a string.
         */
        String fullName = "John Doe";
        String firstName = fullName.substring(0, 4);
        System.out.println("The first name of " + fullName + " is " + firstName);
    }

    static void replace() {
        /**
         * replace() method is used to replace a substring in a string with another substring.
         */
        String message = "Hello, world!";
        String replacedMessage = message.replace("world", "universe");
        System.out.println(replacedMessage);
    }

    static void split() {
        /**
         * split() method is used to split a string into an array of substrings based on a delimiter.
         */
        String message = "Hello, world!";
        String[] words = message.split(", ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    static void trim() {
        /**
         * trim() method is used to remove leading and trailing spaces from a string.
         */
        String message = "   Hello, world!   ";
        String trimmedMessage = message.trim();
        System.out.println(trimmedMessage);
    }

    static void length() {
        /**
         * length() method is used to get the length of a string.
         * It returns the number of characters in the string.
         */
        String message = "Hello, world!";
        int length = message.length();
        System.out.println("The length of " + message + " is " + length);
    }

    static void startsWith() {
        /**
         * startsWith() method is used to check if a string starts with a specific substring.
         * It returns true if the string starts with the substring, false otherwise.
         */
        String message = "Hello, world!";
        boolean startsWithHello = message.startsWith("Hello");
        System.out.println("Does " + message + " start with 'Hello'? " + startsWithHello);
    }

    static void endsWith() {
        /**
         * endsWith() method is used to check if a string ends with a specific substring.
         * It returns true if the string ends with the substring, false otherwise.
         */
        String message = "Hello, world!";
        boolean endsWithWorld = message.endsWith("world!");
        System.out.println("Does " + message + " end with 'world!'? " + endsWithWorld);
    }

    static void equals() {
        /**
         * equals() method is used to compare two strings.
         * It returns true if the two strings are equal, false otherwise.
         */
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areEqual = str1.equals(str2);
        System.out.println("Are " + str1 + " and " + str2 + " equal? with equals " + areEqual);

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        boolean areNotEqual = str3 == str4;
        System.out.println("Are " + str3 + " and " + str4 + " equal? with == " + areNotEqual);

        System.out.println("Are " + str1 + " and " + str3 + " equal? with equals " + str1.equals(str3));
        System.out.println("Are " + str1 + " and " + str3 + " equal? with == " + (str1 == str3));
        System.out.println("Are " + str3 + " and " + str3 + " equal? with == " + (str3 == str3));

    }

    static void equalsIgnoreCase() {
        /**
         * equalsIgnoreCase() method is used to compare two strings ignoring case.
         * It returns true if the two strings are equal ignoring case, false otherwise.
         */
        String str1 = "Hello";
        String str2 = "hello";
        boolean areEqualIgnoringCase = str1.equalsIgnoreCase(str2);
        System.out.println("Are " + str1 + " and " + str2 + " equal ignoring case? " + areEqualIgnoringCase);
    }

    static void contains() {
        /**
         * contains() method is used to check if a string contains a substring.
         * It returns true if the string contains the substring, false otherwise.
         */

        String str1 = "Hello, world!";
        boolean contains = str1.contains("world");
        System.out.println("Does " + str1 + " contain 'world'? " + contains);
    }

    static void replaceAll() {
        /**
         * replaceAll() method is used to replace all occurrences of a substring in a string with another substring.
         */
        String message = "Hello, world!";
        String replacedMessage = message.replaceAll("world", "universe");
        System.out.println(replacedMessage);
    }

    static void replaceFirst() {
        /**
         * replaceFirst() method is used to replace the first occurrence of a substring in a string with another substring.
         */
        String message = "Hello, world!";
        String replacedMessage = message.replaceFirst("world", "universe");
        System.out.println(replacedMessage);
    }

    static void toLowerCase() {
        /**
         * toLowerCase() method is used to convert a string to lowercase.
         */
        String message = "Hello, world!";
        String lowercaseMessage = message.toLowerCase();
        System.out.println(lowercaseMessage);
    }

    static void toUpperCase() {
        /**
         * toUpperCase() method is used to convert a string to uppercase.
         */
        String message = "Hello, world!";
        String uppercaseMessage = message.toUpperCase();
        System.out.println(uppercaseMessage);
    }

    static void toCharArray() {
        /**
         * toCharArray() method is used to convert a string to an array of characters.
         */
        String message = "Hello, world!";
        char[] charArray = message.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
    }

    static void charAt() {
        /**
         * charAt() method is used to get the character at a specific index in a string.
         */
        String message = "Hello, world!";
        char firstLetter = message.charAt(0);
        System.out.println("The first letter of " + message + " is " + firstLetter);
    }

    static void indexOf() {
        /**
         * indexOf() method is used to get the index of a substring in a string.
         */
        String message = "Hello, world!";
        int index = message.indexOf("world");
        System.out.println("The index of 'world' in " + message + " is " + index);
    }

    static void lastIndexOf() {
        /**
         * lastIndexOf() method is used to get the last index of a substring in a string.
         */
        String message = "Hello, world!";
        int lastIndex = message.lastIndexOf("world");
        System.out.println("The last index of 'world' in " + message + " is " + lastIndex);
    }

    static void compareTo() {
        /**
         * compareTo() method is used to compare two strings.
         */
        String str1 = "Hello";
        String str2 = "World";
        int comparisonResult = str1.compareTo(str2);
        System.out.println("Comparison result: " + comparisonResult);
    }

    static void compareToIgnoreCase() {
        /**
         * compareToIgnoreCase() method is used to compare two strings ignoring case.
         */
        String str1 = "Hello";
        String str2 = "world";
        int comparisonResult = str1.compareToIgnoreCase(str2);
        System.out.println("Comparison result ignoring case: " + comparisonResult);
    }

    static void stringFormat() {
        /**
         * String.format() method is used to format a string with arguments.
         */
        String name = "John";
        String greeting = String.format("Hello, %s!", name);
        System.out.println(greeting);
    }

    static void stringBuilder() {
        /**
         * StringBuilder class is used to create mutable strings.
         */
        StringBuilder builder = new StringBuilder("Hello, ");
        builder.append("world!");
        System.out.println(builder.toString());
    }

    static void stringBuffer() {
        /**
         * StringBuffer class is used to create mutable strings.
         */
        StringBuffer buffer = new StringBuffer("Hello, ");
        buffer.append("world!");
        System.out.println(buffer.toString());
    }

    static void questions() {
        String s1 = "John";
        String s2 = "John";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // SCP - 1, Heap - 0

        String s3 = new String("John");
        String s4 = new String("John");

        // SCP - 1, Heap - 2

        String s5 = "John";
        String s6 = "John";
        String s7 = new String("John");

        // SCP - 1, Heap - 1

        String s8 = "John";
        String s9 = "Doe";
        String s10 = s8 + s9;

        // SCP - 2, Heap - 1

        String s11 = "John";
        String s12 = new String("John").intern();

        // SCP - 1, Heap - 1
    }

}
