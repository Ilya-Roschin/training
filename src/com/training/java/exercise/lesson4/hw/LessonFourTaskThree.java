package com.training.java.exercise.lesson4.hw;

import java.util.Scanner;

/**
 *
 example input
 +
 5
 8

 13
 *
 */
public class LessonFourTaskThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        int a = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(calculateResult(a, b, c));
    }

    private static int calculateResult(int a, String b, int c) {

        int result = 0;

        switch (b) {
            case "+":
                result = a + c;
                break;
            case "-":
                result = a - c;
                break;
            case "*":
                result = a * c;
                break;
            case "/":
                result = a / c;
                break;
            default:
                System.out.println("incorrect input");
                break;
        }
        return result;
    }
}