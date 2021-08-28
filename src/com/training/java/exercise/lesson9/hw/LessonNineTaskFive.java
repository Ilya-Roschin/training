package com.training.java.exercise.lesson9.hw;

/**
 * https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
 */

public class LessonNineTaskFive {

    public static void main(String[] args) {

    }

    public static int[] sortArray(int[] array) {

        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = 0; j < array.length; j++) {
                   if (array[i] > array[j] && j > i && array[j] % 2 != 0) {
                       int temp = array[i];
                       array[i] = array[j];
                       array[j] = temp;
                   }
                }
            }
        }
        return array;
    }
}
