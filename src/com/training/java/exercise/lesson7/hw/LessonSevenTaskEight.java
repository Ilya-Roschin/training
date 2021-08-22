package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

public class LessonSevenTaskEight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int sum = 0;
        int multiplication = 1;

        while (number > 0) {
            int temp = number % 10;
            number /= 10;
            sum += temp;
            multiplication *= temp;
        }
        System.out.println("sum = " + sum + "\n" + "multiplication = " + multiplication);
    }
}
