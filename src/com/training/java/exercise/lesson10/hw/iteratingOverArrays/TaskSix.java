package com.training.java.exercise.lesson10.hw.iteratingOverArrays;

import java.util.Scanner;

/**
 * Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending
 * order. Elements of the sequence must go one after another. A single number is assumed to be an ordered sequence with
 * the length = 1.
 *
 * Input data format
 *
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 */
public class TaskSix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(findLengthOfTheLongestSequenceInAscendingOrder(array));
    }

    private static int findLengthOfTheLongestSequenceInAscendingOrder(int[] array) {
        int sequenceLength = 1;
        int result = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[i]) {
                sequenceLength++;
            } else {
                sequenceLength = 1;
            }
            if(result < sequenceLength) {
                result = sequenceLength;
            }
        }
        return result;
    }

}
