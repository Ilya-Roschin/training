package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

public class LessonSevenTaskThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        scanner.close();

        System.out.println(Math.pow(number,power));
    }
}
