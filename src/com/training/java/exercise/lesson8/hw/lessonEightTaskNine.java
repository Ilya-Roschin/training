package com.training.java.exercise.lesson8.hw;

import java.util.Scanner;

public class lessonEightTaskNine {

    public static void main(String[] args) {

        run();
    }


    private static void outputResult(int[] numbersSymbols) {
        System.out.println("Lower symbols: " + numbersSymbols[0] + "\n" + "Upper symbols: " + numbersSymbols[1]);
    }

    private static int[] findNumberSymbols(String userString) {

        int numberLowerSymbols = 0;
        int numberUpperSymbols = 0;

        for (int i = 0; i < userString.length(); i++) {
            if ((int) userString.charAt(i) >= 65 && (int) userString.charAt(i) <= 90) {
                numberUpperSymbols++;
            } else if ((int) userString.charAt(i) >= 97 && (int) userString.charAt(i) <= 122) {
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
        outputResult(numbersSymbols);
    }
}
