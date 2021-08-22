package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

public class LessonSevenTaskFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int negativeOdd = 0;
        int multiplication = 1;

        while (true) {
            int number = scanner.nextInt();
            if (number % 2 != 0 && number < 0) {
                negativeOdd++;
            } else if (number > 0) {
                multiplication *= number;
            } else if (number == 0) {
                break;
            }
        }
        System.out.println("Negative and odd numbers: " + negativeOdd + "\n" + "multiplication of positive numbers: " + multiplication);
    }
}
