package com.training.java.exercise.lesson3.hw;

public class LessonThreeTaskTwo {

    public static void main(String[] args) {

        int a = 7;
        int b = 10;
        int h = 2;

        if (a > b) {
            int t;
            t = a;
            a = b;
            b = t;
        }

        while (a <= b) {
            if (a > 2) {
                System.out.println(a);
            } else {
                System.out.println(-a);
            }
            a += h;
        }
    }
}
