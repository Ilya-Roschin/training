package com.training.java.exercise.lesson3.hw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LessonThreeTaskEight {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int a = 155823;
        int b = 1236576;

        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }

        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.println(b % 10);
            b /= 10;
        }
    }
}
