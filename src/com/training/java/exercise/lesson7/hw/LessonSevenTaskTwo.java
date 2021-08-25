package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

public class LessonSevenTaskTwo {

    public static void main(String[] args) {

        run();
    }

    private static int scanNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    private static boolean isPrimeNumber(int number) {
        int i = 2;
        boolean check = true;
        while (i < number) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        return check;
    }

    private static void printResult(boolean check) {
        if (check) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }
    }

    private static void run() {
        int number = scanNumber();
        boolean check = isPrimeNumber(number);
        printResult(check);
    }


}
