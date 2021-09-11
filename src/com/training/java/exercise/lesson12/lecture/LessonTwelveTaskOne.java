package com.training.java.exercise.lesson12.lecture;

public class LessonTwelveTaskOne {

    private static final String STRING_1 = "ABBA";

    public static void main(String[] args) {

        char[] array = STRING_1.toCharArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j] && array[i] != '.') {
                    array[j] = '.';
                }
            }
        }

        int check = 0;
        for (char element : array) {
            if ((int) element >= 65 && (int) element <= 90) {
                check++;
            }
        }

        if (check == 2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
