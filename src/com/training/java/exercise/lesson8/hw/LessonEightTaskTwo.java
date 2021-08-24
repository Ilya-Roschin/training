package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskTwo {

    public static void main(String[] args) {

        run();
    }

    private static String EnterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private static int findNewArrayLength(char[] charArray) {
        int newArrayLength = charArray.length;
        for (char element : charArray) {
            if (element == 'a') {
                newArrayLength++;
            }
        }
        return newArrayLength;
    }

    private static char[] refactorCharArray(char[] charArray, int newArrayLength) {
        char[] newCharArray = new char[newArrayLength];
        int j = 0;
        for (int i = 0; i < newArrayLength; i++) {
            newCharArray[i] = charArray[j];
            if (newCharArray[i] == 'a') {
                newCharArray[i + 1] = 'b';
                i++;
            }
            j++;
        }
        return newCharArray;
    }

    private static String charArrayToString(char[] newCharArray) {
        StringBuilder refactoringString = new StringBuilder();
        for (char element : newCharArray) {
            refactoringString.append(element);
        }
        return refactoringString.toString();
    }

    private static void run() {
        String userString = EnterString();
        char[] charArray = userString.toCharArray();
        int newArrayLength = findNewArrayLength(charArray);
        char[] newCharArray = refactorCharArray(charArray, newArrayLength);
        System.out.println(charArrayToString(newCharArray));
    }
}
