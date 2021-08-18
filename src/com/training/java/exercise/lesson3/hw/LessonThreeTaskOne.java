package com.training.java.exercise.lesson3.hw;

import java.util.Scanner;

public class LessonThreeTaskOne {

    public static void main(String[] args) {

        int numberFromConsole = readIntFromConsole();

        if (numberFromConsole > 0) {
            int result = calculateSum(numberFromConsole);
            System.out.println("result is " + result);
        } else {
            System.out.println("enter positive number");
        }
    }

    public static int readIntFromConsole() {

        Scanner scanner = new Scanner(System.in);
        int numberFromConsole = scanner.nextInt();
        scanner.close();

        return numberFromConsole;
    }

    private static int calculateSum(int number) {

        int sum = 0;

        while (number > 0) {
            sum += number;
            number--;
        }

        return sum;
    }




}
