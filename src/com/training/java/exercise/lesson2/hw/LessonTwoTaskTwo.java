package com.training.java.exercise.lesson2.hw;

public class LessonTwoTaskTwo {

    public static void main(String[] args) {

        int a = 5;
        int b = -1;
        int c = 3;
        int d = 4;
        int min1, min2, max;

        if (a <= b) {
            min1 = a;
        } else {
            min1 = b;
        }

        if (c <= d) {
            min2 = c;
        } else {
            min2 = d;
        }

        if (min1 >= min2) {
            max = min1;
        } else {
            max = min2;
        }

        System.out.println("max is " + max);
    }
}
