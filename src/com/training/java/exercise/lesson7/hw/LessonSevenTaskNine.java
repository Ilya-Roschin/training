package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

public class LessonSevenTaskNine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println("perfect number");
        } else {
            System.out.println("not perfect number");
        }
    }
}
