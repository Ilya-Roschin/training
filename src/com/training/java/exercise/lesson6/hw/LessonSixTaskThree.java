package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskThree {

    public static void main(String[] args) {

        double[] array = {3, 5, -25.1, 6, -7, 8, 12, 0};
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (double element : array) {
            if (element > 0) {
                positive++;
            } else if (element < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("positive: " + positive + "\n" + "negative: " + negative + "\n" + "zero: " + zero);
    }
}
