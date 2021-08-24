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

    private static String returnNewString(String userString) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < userString.length(); i++) {
            newString.append(userString.charAt(i));
            newString.append(userString.charAt(i));
        }
        return newString.toString();
    }

    private static void run() {
        String userString = enterString();
        String newString = returnNewString(userString);
        System.out.println(newString);
    }

}
