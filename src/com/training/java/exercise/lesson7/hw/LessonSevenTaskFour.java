package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

import static com.training.java.exercise.lesson3.lecture.LessonThreeTaskThree.calculateFactorial;

public class LessonSevenTaskFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        scanner.close();
        int sum = 0;

        for (int i = userNumber; i > 0; i--) {
            sum += calculateFactorial(i);
        }

        System.out.println(sum);
    }

    private int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }


}