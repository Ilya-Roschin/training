package com.training.java.exercise.lesson5.lecture;

public class LessonFiveTaskFive {

    public static void main(String[] args) {

        int[] array = {5, 6, 7, 8, 8, 15, 2};

        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(array[i] + ",");
            }

        }

    }
}
