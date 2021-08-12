package com.training.java.exercise.lesson5.lecture;

public class LessonFiveTaskThree {

    public static void main(String[] args) {

        int[] array = {1, 5, 6, 8, 4, 5, 91};
        int result = 0;

        for (int element : array) {
            result += element;
        }

        System.out.println(result);

    }
}
