package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskFour {

    public static void main(String[] args) {

        int[] array = {1, 6, 7, 3, -5, 15, 26};
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }

        int temp = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = temp;

        for (int element : array) {
            System.out.print(element + ", ");
        }

    }
}
