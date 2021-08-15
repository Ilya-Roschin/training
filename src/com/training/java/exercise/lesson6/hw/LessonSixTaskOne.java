package com.training.java.exercise.lesson6.hw;

import java.sql.Array;

public class LessonSixTaskOne {

    public static void main(String[] args) {

        int[] array = {1, 5, 8, 7, 6, 4};
        int number = 2;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}