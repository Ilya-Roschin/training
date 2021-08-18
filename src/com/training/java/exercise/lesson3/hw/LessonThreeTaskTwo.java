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
        calculateFunctionValue(a, b, h);
    }
    private static void calculateFunctionValue(int numb1, int numb2, int numb3) {

        while (numb1 <= numb2) {
            if (numb1 > 2) {
                System.out.println(numb1);
            } else {
                System.out.println(-numb1);
            }
            numb1 += numb3;
        }

    }


}

