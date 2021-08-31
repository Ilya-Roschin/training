package com.training.java.exercise.lesson9.hw;

import java.util.Scanner;

/**
 * https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
 */
public class LessonNineTaskOne {

    private static final int LOWER_BOUND_SMALL_LETTERS = 97;
    private static final int UPPER_BOUND_SMALL_LETTERS = 122;
    private static final int LOWER_BOUND_BIG_LETTERS = 65;
    private static final int UPPER_BOUND_BIG_LETTERS = 90;
    private static final int LOWER_BOUND_NUMBERS = 48;
    private static final int UPPER_BOUND_NUMBERS = 57;
    private static final char SPACE = ' ';

    public static void main(String[] args) {

        String text = enterText();
        int result = duplicateCount(text);
        System.out.println(result);
    }

    private static String enterText() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        return text;
    }

    public static int duplicateCount(String text) {
        int numberOfDuplicates = 0;
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && charArray[i] >= LOWER_BOUND_NUMBERS &&
                        charArray[i] <= UPPER_BOUND_NUMBERS && i != j) {
                    numberOfDuplicates++;
                    charArray = deleteDuplicatedNumbersFromString(charArray, i);


                } else if ((i != j) && ((charArray[i] == charArray[j]) || ((int) charArray[i] == (int) charArray[j] +
                        (LOWER_BOUND_BIG_LETTERS + LOWER_BOUND_SMALL_LETTERS)) || (int) charArray[i] ==
                        (int) charArray[j] + (LOWER_BOUND_BIG_LETTERS - LOWER_BOUND_SMALL_LETTERS)) &&
                        ((LOWER_BOUND_SMALL_LETTERS <= (int) charArray[i] && UPPER_BOUND_SMALL_LETTERS >=
                        (int) charArray[i]) || (LOWER_BOUND_BIG_LETTERS <= (int) charArray[i] &&
                        UPPER_BOUND_BIG_LETTERS >= (int) charArray[i]))) {
                    numberOfDuplicates++;
                    charArray = deleteDuplicatedSymbolsFromString(charArray, i);

                }
            }
        }
        return numberOfDuplicates;
    }

    private static char[] deleteDuplicatedNumbersFromString (char[] charArray, int indexDuplicatedSymbol) {
        char duplicatedSymbol = charArray[indexDuplicatedSymbol];

        for (int i = 0; i < charArray.length; i++) {
            if (duplicatedSymbol == charArray[i]) {
                charArray[i] = SPACE;
            }
        }
    return charArray;
    }

    private static char[] deleteDuplicatedSymbolsFromString (char[] charArray, int indexDuplicatedSymbol) {
        char duplicatedSymbol = charArray[indexDuplicatedSymbol];

        for (int i = 0; i < charArray.length; i++) {
            if ((int) duplicatedSymbol == (int) charArray[i] || (int) duplicatedSymbol == (int) charArray[i] +
                    LOWER_BOUND_BIG_LETTERS - LOWER_BOUND_SMALL_LETTERS || (int) duplicatedSymbol ==
                    (int) charArray[i] + LOWER_BOUND_BIG_LETTERS + LOWER_BOUND_SMALL_LETTERS) {
                charArray[i] = SPACE;
            }
        }
        return charArray;
    }
}
