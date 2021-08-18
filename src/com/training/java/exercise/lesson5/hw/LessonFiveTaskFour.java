package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        System.out.println("way 1:");

        final String message = "max number: ";
        if (number1 >= number2) {
            System.out.println(message + number1);
        } else {
            System.out.println(message + number2);
        }

        String result = (number1 >= number2) ? message + number1 : message + number2;
        System.out.println("way 2:" + "\n"+ result);
    }
}
