package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskFive {

    public static void main(String[] args) {

        int[] array = {1, 6, 7, 3, 2, 6, 88, 5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println(array[i] + ", ");
            }
        }
    }
}
