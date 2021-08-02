package com.training.java.exercise.lesson2.hw;

import static java.lang.Math.pow;

public class LessonTwoTaskFive {

    public static void main(String[] args) {

        int x = 5;
        double f;

        if (x <= 3) {
            f = pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (pow(x, 3) + 6);
        }

        System.out.println("result is " + f);
    }
}
