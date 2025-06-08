package com.autoramming.core.basics;

public class Primitive {

    public static void main(String[] args) {
        // Primitive data types:

        // > Numeric data types: int, byte, short, long, float, double
        // ---* Integral data types: byte, short, int, long
        // ---* Floating-point or decimal data types: float, double

        // > Non-numeric data types: char, boolean
        // ---* Binary data types: boolean
        // ---* Character data types: char

        // Wrapper classes: Integer, Byte, Short, Long, Float, Double, Character, Boolean

        // Ranges of the data types:
        // byte range: -128 to 127
        // short range: -32,768 to 32,767
        // int range: -2,147,483,648 to 2,147,483,647
        // long range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float range: 1.4E-45 to 3.4028235E38
        // double range: 4.9E-324 to 1.7976931348623157E308
        // char range: 0 to 65,535
        // boolean range: true or false

        // byte and bit size of all the data types:
        // boolean: 1/8 byte - 1 bit
        // byte: 1 byte - 8 bits
        // short: 2 bytes - 16 bits
        // char: 2 bytes - 16 bits
        // int: 4 bytes - 32 bits
        // float: 4 bytes - 32 bits
        // long: 8 bytes - 64 bits
        // double: 8 bytes - 64 bits

        // Default values of the data types:
        // byte: 0
        // short: 0
        // int: 0
        // long: 0
        // float: 0.0f
        // double: 0.0
        // char: '\u0000'
        // boolean: false

        System.out.println("Byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        byte a = 127;
        System.out.println("Example byte value: " + a);
        System.out.println("--------------------");

        System.out.println("Short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        short b = 32767;
        System.out.println("Example short value: " + b);
        System.out.println("--------------------");

        System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        int c = 2147483647;
        System.out.println("Example integer value: " + c);
        System.out.println("--------------------");


        System.out.println("Long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        long d = 9223372036854775807L;
        System.out.println("Example long value: " + d);
        System.out.println("--------------------");

        System.out.println("Float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        float e = 3.14f;
        System.out.println("Example float value: " + e); // ~7 decimal digits
        System.out.println("--------------------");

        System.out.println("Double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        double f = 3.14159;
        System.out.println("Example double value: " + f); // ~15 decimal digits
        System.out.println("--------------------");

        System.out.println("Char range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        char g = 'a';
        System.out.println("Example char value: " + g);
        System.out.println("--------------------");

        // Boolean data type has two values: true and false
        // Boolean data type is 1 bit
        System.out.println("Boolean values: " + Boolean.TRUE + " and " + Boolean.FALSE);
        boolean h = true;
        System.out.println("Example boolean value: " + h);
        System.out.println("--------------------");

        
        // Character data type range is 0 to 65535
        // What is Unicode?
        // Unicode is a standard for representing characters in different languages and scripts
        // Unicode range: 0 to 65535
        // Example of Unicode characters: all characters in the world
        // Unicode range is a superset of ASCII range

        // What is ASCII?
        // ASCII stands for American Standard Code for Information Interchange
        // ASCII range: 0 to 127 (Contains only printable characters)

        // Example of ASCII characters: a to z, A to Z, 0 to 9, space, punctuation, etc.
        // Extended ASCII range: 128 to 255
        // Example of extended ASCII characters: symbols, control characters (escape), etc.


    }

    /**
     * Adds two integers and returns their sum
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
}
