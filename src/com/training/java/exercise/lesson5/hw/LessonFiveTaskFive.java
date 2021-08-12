package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else {
            System.out.println(number1 + " < " + number2);
        }
    }
}
