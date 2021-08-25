package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskTwo {

    private static final char B_LETTER = 'b';

    private String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private int findNewArrayLength(char[] charArray) {
        int newArrayLength = charArray.length;
        for (char element : charArray) {
            if (element == Constants.LETTER_A) {
                newArrayLength++;
            }
        }
        return newArrayLength;
    }

    private  char[] refactorCharArray(char[] charArray, int newArrayLength) {
        char[] newCharArray = new char[newArrayLength];
        int j = 0;
        for (int i = 0; i < newArrayLength; i++) {
            newCharArray[i] = charArray[j];
            if (newCharArray[i] == Constants.LETTER_A) {
                newCharArray[i + 1] = B_LETTER;
                i++;
            }
            j++;
        }
        return newCharArray;
    }

    private String charArrayToString(char[] newCharArray) {
        StringBuilder refactoringString = new StringBuilder();
        for (char element : newCharArray) {
            refactoringString.append(element);
        }
        return refactoringString.toString();
    }

    void run() {
        String userString = enterString();
        char[] charArray = userString.toCharArray();
        int newArrayLength = findNewArrayLength(charArray);
        char[] newCharArray = refactorCharArray(charArray, newArrayLength);
        System.out.println(charArrayToString(newCharArray));
    }
}
