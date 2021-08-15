package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskEight {

    public static void main(String[] args) {

        int[] array = {1, 6, 7, 3, -5, 15, 26};
        int min = array[0];

        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                System.out.println(array[i] + ", ");
                }
            }
        }
}

