package com.training.java.exercise.lesson10.hw.iteratingOverArrays;

import java.util.Scanner;

public class TaskOneWithoutFunction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] arrayNumbers = new int[arraySize];
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            arrayNumbers[i] = scanner.nextInt();
        }
        int userNumber = scanner.nextInt();
        for (int element : arrayNumbers) {
            if (element > userNumber) {
                sum += element;
            }
        }
        System.out.println(sum);
    }
}
