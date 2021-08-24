package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class LessonEightTaskFive {

    public static void main(String[] args) {

        run();
    }


    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    private static int findNumberSymbolA(String userString) {
        int numberSymbolA = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == 'a') {
                numberSymbolA++;
            }
        }
        return numberSymbolA;
    }

    private static void outputResult(int numberSymbolA) {
        System.out.println("number symbol 'a' = " + numberSymbolA);
    }

    private static void run() {
        String userString = enterString();
        int numberSymbolA = findNumberSymbolA(userString);
        outputResult(numberSymbolA);
    }
}
