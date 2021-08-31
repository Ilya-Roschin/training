package com.training.java.exercise.lesson9.hw;

import java.util.Scanner;

public class LessonNineTaskThree {

    public static void main(String[] args) {

       int userNumber = enterNumber();
       int result = opposite(userNumber);
        System.out.println(result);
    }

    public static int opposite(int number) {
        return number != 0 ? -number : number;
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        scanner.close();
        return userNumber;
    }
}
