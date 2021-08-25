package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

public class LessonSevenTaskOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        scanner.close();

        if (numberOne > numberTwo) {
            int temp = numberOne;
            numberOne = numberTwo;
            numberTwo = temp;
        }

        for (int i = numberOne; i <= numberTwo; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println(i);
            }
        }
    }
}
