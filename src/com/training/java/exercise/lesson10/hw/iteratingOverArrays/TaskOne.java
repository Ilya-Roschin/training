package com.training.java.exercise.lesson10.hw.iteratingOverArrays;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        int arraySize = enterUserNumber();
        int[] arrayNumbers = enterArray(arraySize);
        int userNumber = enterUserNumber();
        int sum = findSummaryOfArrayElements(arrayNumbers, userNumber);
        System.out.println(sum);
    }

    private static int enterUserNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] enterArray(int arraySize) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayNumbers[i] = scanner.nextInt();
        }
        return arrayNumbers;
    }

    private static int findSummaryOfArrayElements(int[] array, int userNumber) {
        int sum = 0;
        for (int element : array) {
            if (element > userNumber) {
                sum += element;
            }
        }
        return sum;
    }

}
