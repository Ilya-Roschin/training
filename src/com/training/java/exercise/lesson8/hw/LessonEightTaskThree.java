package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskThree {

    public static void main(String[] args) {

        run();
    }


    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private static String replaceGaps(String userString) {
        return userString.replaceAll("\\s", "");
    }

    private static String reversString(String replacedString) {
        return new StringBuilder(replacedString).reverse().toString();
    }

    private static boolean isStringsEquals(String replacedString, String reversedString) {
        return replacedString.equals(reversedString);
    }

    private static void outputResult(boolean isEquals) {
        if (isEquals) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    private static void run() {
        String userString = enterString();
        String replacedString = replaceGaps(userString);
        String reversedString = reversString(replacedString);
        boolean isEquals = isStringsEquals(replacedString, reversedString);
        outputResult(isEquals);
    }

}
