package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 60) {
            System.out.println("Great");
        } else if (number >= 30) {
            System.out.println("Good");
        } else if (number >= 17) {
            System.out.println("satisfyingly");
        } else {
            System.out.println("bad");
        }
    }
}
