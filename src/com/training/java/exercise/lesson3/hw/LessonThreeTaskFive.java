package com.training.java.exercise.lesson3.hw;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class LessonThreeTaskFive {

    public static void main(String[] args) {

        double e = 0.3d;
        System.out.println(sumFunction(e));
    }

    public static double sumFunction(double number) {

        int n = 1;
        double sum = 0d;
        double element = 1 / pow(2, n) + 1 / pow(3, n);

        while (abs(element) >= number) {
            sum += element;
            n++;
            element = 1 / pow(2, n) + 1 / pow(3, n);
        }

        return sum;
    }

}
