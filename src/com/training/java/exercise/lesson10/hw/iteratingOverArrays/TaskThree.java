package com.training.java.exercise.lesson10.hw.iteratingOverArrays;

import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int[] resultArray = shiftToTheRight(array);
        for (int element : resultArray) {
            System.out.print(element + " ");
        }
    }

    private static int[] shiftToTheRight(int[] array) {

        int[] tempArray = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            tempArray[i] = array[i - 1];
        }
        tempArray[0] = array[array.length - 1];
        return tempArray;
    }


}
