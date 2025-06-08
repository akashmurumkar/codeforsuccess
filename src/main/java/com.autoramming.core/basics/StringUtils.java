package com.autoramming.core.basics;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringUtils {

    public static void main(String[] args) {
        stringJoiner();
        stringTokenizer();
    }

    static void stringJoiner() {
        /**
         * StringJoiner class is used to create mutable strings.
         */
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Hello");
        joiner.add("World");
        System.out.println(joiner);
    }

    static void stringTokenizer() {
        /**
         * StringTokenizer class is used to tokenize a string into substrings.
         */
        String message = "Hello, world!";
        StringTokenizer tokenizer = new StringTokenizer(message, ", ");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }

}
