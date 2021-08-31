package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskTen {

    private static final char QUESTION_MARK = '?';
    private static final char EXCLAMATION_POINT = '!';
    private static final char POINT = '.';



    private static int findNumberSentence(String userString) {
        int numberSentence = 0;
        for (int i = 2; i <= userString.length(); i++) {
            if (userString.charAt(i) == QUESTION_MARK || userString.charAt(i) == POINT ||
                    userString.charAt(i) == EXCLAMATION_POINT && userString.charAt(i - 1) == Constants.SPACE
                            && userString.charAt(i - 2) != Constants.SPACE) {
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
        System.out.println(numberSentence);
    }
}
