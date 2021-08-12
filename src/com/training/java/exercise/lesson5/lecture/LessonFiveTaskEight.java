package com.training.java.exercise.lesson5.lecture;

public class LessonFiveTaskEight {

    public static void main(String[] args) {

        int number = 4343679;

        while (number >= 10) {
            int element;
            element = number % 10;
            number /= 10;

            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
    }
}
