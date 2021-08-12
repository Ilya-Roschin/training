package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskSeven {

    public static void main(String[] args) {

        int[] array = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int max = array[0];
        int min = array[0];

        for (int element : array) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }

        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}
