package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

import static java.lang.Math.pow;

public class LessonSevenTaskThree {

    static int number = 2;
    private static String input = "  efefe  ".trim();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        scanner.close();

        System.out.println(pow(number,power));
    }
}
