package com.training.java.exercise.lesson10.lecture;

import java.util.Scanner;

public class LessonTenTaskOne {

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void run() {

        int number1 = enterNumber();
        int number2 = enterNumber();
        int number3 = enterNumber();
        int number4 = enterNumber();
        int number5 = enterNumber();

        int result1 = findMax(number1, number2, number3);
        int result2 = findMax(number4, number2, number3);
        int result3 = findMax(number4, number5, number3);

        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n");
    }

    private static int findMax(int number1, int number2, int number3) {
        if (number1 < number2 && number2 > number3) {
            return number2;
        } else if (number3 > number2 && number3 > number1) {
            return number3;
        } else {
            return number1;
        }
    }


}
