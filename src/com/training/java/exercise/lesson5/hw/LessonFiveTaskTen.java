package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class LessonFiveTaskTen {

    public static void main(String[] args) {

        int rad = 1;
        Scanner scanner = new Scanner(System.in);
        int centX = scanner.nextInt();
        int centY = scanner.nextInt();
        int pointX = scanner.nextInt();
        int pointY = scanner.nextInt();
        scanner.close();

        if (sqrt(pow((pointX - centX), 2) + pow((pointY - centY), 2)) == rad) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
