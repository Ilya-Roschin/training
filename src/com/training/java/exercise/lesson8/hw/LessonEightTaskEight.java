package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskEight {

    public static void main(String[] args) {

        rum();
    }

    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private static int findIndexBiggestWord(String userString) {
        int indexFirstSymbol = 0;
        int wordLength = 0;
        int maxWordLength = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == Constants.SPACE) {
                wordLength = 0;
                continue;
            } else {
                wordLength++;
            }
            if (wordLength > maxWordLength) {
                maxWordLength = wordLength;
                indexFirstSymbol = i - maxWordLength + 1;
            }
        }
        return indexFirstSymbol;
    }

    private static void outputResult(int indexFirstSymbol, String userString) {
        int i = indexFirstSymbol;
        while (true) {
            if (userString.charAt(i) != Constants.SPACE) {
                System.out.print(userString.charAt(i));
            } else {
                break;
            }
            i++;
        }
    }

    private static void rum() {
        String userString = enterString();
        int indexFirstSymbol = findIndexBiggestWord(userString);
        outputResult(indexFirstSymbol, userString);
    }

}
