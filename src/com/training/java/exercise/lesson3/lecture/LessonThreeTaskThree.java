package com.training.java.exercise.lesson3.lecture;

import java.util.Scanner;

/**
 * Ввести целое неотрицательное число. Посчитать факториал данного числа.
 */

public class LessonThreeTaskThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        if (a > 0) {
            int result = calculateFactorial(a);
            System.out.println(result);
        } else if (a == 0) {
            System.out.println(0);
        } else {
            System.out.println("error");
        }


    }

    public static int calculateFactorial(int number) {
        int fac = 1;
        while (number > 0) {
            fac *= number;
            number--;
        }
        return fac;
    }
}
