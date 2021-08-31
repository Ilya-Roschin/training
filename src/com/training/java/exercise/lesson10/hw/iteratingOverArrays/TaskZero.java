package com.training.java.exercise.lesson10.hw.iteratingOverArrays;

import java.util.Scanner;

public class TaskZero {

    public static void main(String[] args) {

        int arraySize = enterUserNumber();
        int[] arrayNumbers = enterUserNumbers(arraySize);
        int userNumber = enterUserNumber();
        System.out.println(isUserNumberInArray(arrayNumbers, userNumber));
    }

    private static boolean isUserNumberInArray(int[] arrayNumbers, int userNumber) {
        for (int element : arrayNumbers) {
            if (element == userNumber) {
                return true;
            }
        }
        return false;
    }

    private static int enterUserNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] enterUserNumbers(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        String stringOfNumbers = scanner.nextLine();
        int[] resultArray = new int[arraySize];
        int j = 0;
        for (int i = 0; i < stringOfNumbers.length(); i++) {
            if (stringOfNumbers.charAt(i) != ' ' && j < arraySize) {
                resultArray[j] = stringOfNumbers.charAt(i) - 48;
                j++;
            }
        }
        return resultArray;
    }

}
