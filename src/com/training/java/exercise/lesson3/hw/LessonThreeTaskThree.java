package com.training.java.exercise.lesson3.hw;

public class LessonThreeTaskThree {

    public static void main(String[] args) {

        int a = 100;

        System.out.println(calculateSum(a));
    }

    public static int calculateSum(int number) {

        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += Math.pow(i, 2);
        }

        return sum;
    }


}
