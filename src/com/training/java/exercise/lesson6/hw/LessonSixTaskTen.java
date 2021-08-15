package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskTen {

    public static void main(String[] args) {

        int[] array = {5, 3, 5, 6, 8, 9, 19, 3};

        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0) {
                array[i] = 0;
            }
        }

        for (int element : array) {
            System.out.print(element + ", ");
        }
    }
}
