package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

public class LessonSevenTaskSeven {

    public static void main(String[] args) {
        int minNumber = 0;
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        for (int i = 0; i < firstNumber; i++) {
            int userNumber = scanner.nextInt();
            if (minNumber == 0 && i == 0) {
                minNumber = userNumber;
            }
            if (minNumber > userNumber) {
                minNumber = userNumber;
            }
        }

        System.out.println(minNumber);
    }
}
