package com.autoramming.core.basics;

public class IncreDecrement {

    public static void main(String[] args) {
        // Pre-increment is ++a (First increment then assign)
        // Post-increment is a++ (First assign then increment)
        // Pre-decrement is --a (First decrement then assign)
        // Post-decrement is a-- (First assign then decrement)

        int a = 10;
        int b = 20;
        int aa = 10;
        int bb = 20;

        System.out.println(a++); // 10
        System.out.println(b--); // 20

        System.out.println(a); // 11
        System.out.println(b); // 19

        System.out.println(++aa); // 11
        System.out.println(--bb); // 19

        System.out.println(aa); // 11
        System.out.println(bb); // 19

        int c = 10;
        System.out.println(++c + c++ + ++c + ++c + c++ + ++c); // 22
        // 11 + 11 + 13 + 14 + 14 + 16 = 79

        int d = 10;
        System.out.println(--d + d-- + --d + --d + d-- + --d); // 6
        // 9 + 9 + 7 + 6 + 6 + 4 = 41
        // 9 + 9 + 7 + 6 + 6 + 4 = 41

    }
}
