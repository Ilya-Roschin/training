package com.training.java.exercise.lesson10.hw.iteratingOverArrays;

import java.util.Scanner;

/**
 * Write a program that reads an array of integers and two numbers n and m. The program must check that n and m never
 * occur next to each other (in any order) in the array.
 */
public class TaskFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(isNumbersNeverOccurNext(array, number1, number2));
        }

        private static boolean isNumbersNeverOccurNext(int[] array, int number1, int number2) {
            for (int i = 1; i < array.length; i++) {
                if ((number1  == array[i - 1] && number2 == array[i]) ||
                (number1 == array[i] && number2 == array[i - 1])) {
                    return false;
                }
            }
            return true;
        }
}
