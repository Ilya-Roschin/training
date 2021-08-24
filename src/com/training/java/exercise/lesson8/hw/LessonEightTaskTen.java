package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskTen {

    public static void main(String[] args) {

        run();
    }


    private static void outputResult(int numberSentence) {
        System.out.println(numberSentence);
    }

    private static int findNumberSentence(String userString) {
        int numberSentence = 0;
        for (int i = 2; i <= userString.length(); i++) {
            if (userString.charAt(i) == '?' || userString.charAt(i) == '.' ||
                    userString.charAt(i) == '!' && userString.charAt(i - 1) == ' '
                            && userString.charAt(i - 2) != ' ') {
                numberSentence++;
            }
        }
        return numberSentence;
    }

    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private static void run() {
        String userString = enterString();
        int numberSentence = findNumberSentence(userString);
        outputResult(numberSentence);
    }
}
