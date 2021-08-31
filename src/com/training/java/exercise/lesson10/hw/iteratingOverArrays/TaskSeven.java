package com.training.java.exercise.lesson10.hw.iteratingOverArrays;

import java.util.Scanner;

/**
 * Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m
 * occur next to each other in the array (in any order).
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array.
 * The third line contains two integer numbers n and m.
 * All numbers in the same line are separated by the space character.
 */
public class TaskSeven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(isNumbersOccurNext(array, number1, number2));
    }

    private static boolean isNumbersOccurNext(int[] array, int number1, int number2) {
        for (int i = 1; i < array.length; i++) {
            if ((number1  == array[i - 1] && number2 == array[i]) ||
                    (number1 == array[i] && number2 == array[i - 1])) {
                return true;
            }
        }
        return false;
    }
}
