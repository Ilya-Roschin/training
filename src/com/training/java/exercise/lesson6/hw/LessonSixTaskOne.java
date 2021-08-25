package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskOne {

    public static void main(String[] args) {

        int[] array = {1, 5, 8, 7, 6, 4};
        int number = 2;
        int sum = 0;

        for (int element : array) {
            if (element % number == 0) {
                sum += element;
            }
        }
        System.out.println(sum);
    }
}