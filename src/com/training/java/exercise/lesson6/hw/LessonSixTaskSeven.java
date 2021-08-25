package com.training.java.exercise.lesson6.hw;

public class LessonSixTaskSeven {

    public static void main(String[] args) {

        double[] array = {5, 56, 56.3, 43, 45, 65, 65, 5};


        double maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            final double v = array[i] + array[array.length - i - 1];
            if (v > maxSum) {
                maxSum = v;
            }
        }
        System.out.println(maxSum);
    }
}

