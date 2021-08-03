package com.training.java.exercise.lesson3.lecture;

import java.util.Scanner;

/**
 * Введите два числа. Посчитать сумму чисел между ними, т.е. числа принадлежащие отрезку.
 */
public class LessonThreeTaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int sum = 0;

        if (a < b) {
            int t;
            t = a;
            a = b;
            b = t;
        }

        while (a >= b) {
            sum += a;
            --a;
        }
        System.out.println(sum);
    }
}