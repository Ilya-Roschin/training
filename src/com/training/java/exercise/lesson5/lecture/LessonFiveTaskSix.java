package com.training.java.exercise.lesson5.lecture;

public class LessonFiveTaskSix {

    public static void main(String[] args) {

        int[] array = {5, 6, 7, 8, 8, 15, 2};
        int index1 = 0;
        int index2 = 5;
        int t;

        t = array[index1];
        array[index1] = array[index2];
        array[index2] = t;

        for (int element : array) {
            System.out.println(element);
        }
    }
}
