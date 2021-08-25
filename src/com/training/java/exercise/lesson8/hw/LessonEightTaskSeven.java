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

    private static char[] deleteRepeatsSymbolsFromString(String userString) {
        char[] charArray = userString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] != Constants.SPACE && charArray[i] == charArray[j] && i != j) {
                    charArray[j] = Constants.SPACE;
                }
            }
        }
        return charArray;
    }

    private static String deleteSpaces(char[] charArray) {
        StringBuilder newString = new StringBuilder();
        for (char element : charArray) {
            if (element != Constants.SPACE) {
                newString.append(element);
            }
        }
        return newString.toString();
    }

    private static void run() {
        String userString = enterString();
        char[] stringWithoutRepeatedSymbols = deleteRepeatsSymbolsFromString(userString);
        String StringWithoutSpaces = deleteSpaces(stringWithoutRepeatedSymbols);
        System.out.println(StringWithoutSpaces);
    }
}
