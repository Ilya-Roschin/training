package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskSeven {

    public static void main(String[] args) {

        run();
    }


    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private static String refactorString(String userString) {
        char[] charArray = userString.toCharArray();
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] != ' ' && charArray[i] == charArray[j] && i != j) {
                    charArray[j] = ' ';
                }
            }
        }
        for (char element : charArray) {
            if (element != ' ') {
                newString.append(element);
            }
        }
        return newString.toString();
    }


    private static void outputString(String outputString) {
        System.out.println(outputString);
    }

    private static void run() {
        String userString = enterString();
        String newString = refactorString(userString);
        outputString(newString);
    }

}
