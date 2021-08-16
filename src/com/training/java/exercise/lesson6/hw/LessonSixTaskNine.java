package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskNine {

    public static void main(String[] args) {

        int[] array = {15, 6, 7, 15, 3, -5, 15, 26};
        int numberRepeat = 0;
        int repeat = 0;
        int number = array[0];

        for (int i = 0; i < array.length; i++) {
            repeat = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    repeat++;
                    if (repeat > numberRepeat) {
                        numberRepeat = repeat;
                        number = array[i];
                    } else if (repeat == numberRepeat && number != array[i] && array[i] < number) {
                       number = array[i];
                    }
                }
            }
        }
        System.out.println("number: " +  + number + "\n" + "repeat: " + numberRepeat);
    }

}