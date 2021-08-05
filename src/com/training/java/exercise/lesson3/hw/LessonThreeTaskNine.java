package com.training.java.exercise.lesson3.hw;

public class LessonThreeTaskNine {

    public static void main(String[] args) {

        int a = 15;
        int n = a / 2;
        int[] arr = new int[n];
        int t = 1;

        for (int i = 0; i < n; i++) {

            arr[i] = t;
            t += 2;
        }

        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
