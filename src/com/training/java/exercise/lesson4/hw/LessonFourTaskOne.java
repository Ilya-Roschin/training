package com.training.java.exercise.lesson4.hw;

import java.util.Scanner;

public class LessonFourTaskOne {

    public static void main(String[] args) {

        int sizeOfArray = 5;
        int target = 6;
        int[] array = arrayInicialization(sizeOfArray);

        System.out.println(findIndex(sizeOfArray, array, target));
    }

    private static int[] arrayInicialization(int sizeOfArray) {

        int[] arr = new int[sizeOfArray];

        System.out.println("Enter array elements: ");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < sizeOfArray; i++) {
            int number = 0;
            number = scanner.nextInt();
            arr[i] = number;
        }
        scanner.close();

        return arr;
    }

    private static String findIndex(int sizeOfArray, int[] array, int target) {

        boolean waysForTarget = false;
        String result = null;

        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                if ((array[i] + array[j] == target) && (i != j)) {
                    result = "index 1 = " + i + " index 2 = " + j + " target is: " + target;
                    waysForTarget = true;
                }
            }
            if (waysForTarget == true) {
                break;
            }
        }
        if (waysForTarget == false) {
            result = "false";
        }
        return result;
    }

}
