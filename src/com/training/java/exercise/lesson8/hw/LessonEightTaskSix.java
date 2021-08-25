package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskSix {

    public static void main(String[] args) {

        run();
    }

    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private static String returnNewString(String userString, int amountOfRepeats) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < userString.length(); i++) {
            for (int j = 0; j < amountOfRepeats; j++) {
                newString.append(userString.charAt(i));
            }

        }
        return newString.toString();
    }

    private static void run() {
        String userString = enterString();
        String newString = returnNewString(userString,3);
        System.out.println(newString);
    }

}
