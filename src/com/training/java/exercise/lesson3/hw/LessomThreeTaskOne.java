package com.training.java.exercise.lesson3.hw;

import java.util.Scanner;

public class LessomThreeTaskOne {

    public static void main(String[] args) {

        int result;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        if (a > 0) {
            result = calculateSum(a);
            System.out.println("result is " + result);
        } else {
            System.out.println("enter positive number");
        }
    }

    public static int calculateSum(int number) {

        int sum = 0;

        while (number > 0) {
            sum += number;
            number--;
        }

        return sum;
    }


}
