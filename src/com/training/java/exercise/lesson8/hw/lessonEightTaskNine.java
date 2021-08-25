package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class lessonEightTaskNine {

    private static final int LOWER_BOUND_SMALL_LETTERS = 97;
    private static final int UPPER_BOUND_SMALL_LETTERS = 122;
    private static final int LOWER_BOUND_BIG_LETTERS = 65;
    private static final int UPPER_BOUND_BIG_LETTERS = 90;

    public static void main(String[] args) {

        run();
    }

    private static int[] findNumberSymbols(String userString) {

        int numberLowerSymbols = 0;
        int numberUpperSymbols = 0;

        for (int i = 0; i < userString.length(); i++) {
            if ((int) userString.charAt(i) >= LOWER_BOUND_BIG_LETTERS &&
                    (int) userString.charAt(i) <= UPPER_BOUND_BIG_LETTERS) {
                numberUpperSymbols++;
            } else if ((int) userString.charAt(i) >= LOWER_BOUND_SMALL_LETTERS &&
                    (int) userString.charAt(i) <= UPPER_BOUND_SMALL_LETTERS) {
                numberLowerSymbols++;
            }
        }
        return new int[]{numberLowerSymbols, numberUpperSymbols};
    }

    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private static void run() {
        String userString = enterString();
        int[] numbersSymbols = findNumberSymbols(userString);
        System.out.println("Lower symbols: " + numbersSymbols[0] + "\n" + "Upper symbols: " + numbersSymbols[1]);
    }
}
