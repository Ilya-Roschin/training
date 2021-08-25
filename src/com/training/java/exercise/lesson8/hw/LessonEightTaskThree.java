package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskThree {

    private static final String REGEX_FOR_SPACE = "\\s";
    private static final String EMPTY_STRING = "";

    private String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    void run() {
        String userString = enterString();
        String replacedString = userString.replaceAll(REGEX_FOR_SPACE, EMPTY_STRING);
        String reversedString = new StringBuilder(replacedString).reverse().toString();
        boolean equality = replacedString.equals(reversedString);
        String result = equality ? "palindrome" : "not palindrome";
        System.out.println(result);
    }

}
