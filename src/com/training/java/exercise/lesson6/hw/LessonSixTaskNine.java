package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskNine {

    public static void main(String[] args) {

        int[] array = {15, 6, 7, 15, 3, -5, 15, 26};
        int numberRepeat = 0;
        int repeat = 0;
        int number = array[0];

        for (int j : array) {
            repeat = 0;
            for (int k : array) {
                if (j == k) {
                    repeat++;
                    if (repeat > numberRepeat) {
                        numberRepeat = repeat;
                        number = j;
                    } else if (repeat == numberRepeat && j < number) {
                        number = j;
                    }

                }
            }
        }
        System.out.println("number: " +  + number + "\n" + "repeat: " + numberRepeat);
    }

}