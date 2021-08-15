package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskTwo {

    public static void main(String[] args) {

        int[] array = {1, 6, 7, 8, 9, 0, 15, 7, 26};
        int number = 8;
        int change = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                change++;
                array[i] = number;
            }
        }
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("replacements: " + change);
    }

}
