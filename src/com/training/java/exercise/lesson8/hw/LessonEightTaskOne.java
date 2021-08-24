package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskOne {

    public static void main(String[] args) {

        run();
    }


    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private static int findNumberSpace(char[] charArray) {
        int numberSpace = 0;
        int temp = 0;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == ' ') {
                temp++;
                if (temp > numberSpace) {
                    numberSpace = temp;
                }
            } else {
                temp = 0;
            }
        }
        return numberSpace;
    }

    private static void run() {
        String userString = enterString();
        char[] charArray = userString.toCharArray();
        System.out.println(findNumberSpace(charArray));
    }
}
