package com.training.java.exercise.lesson4.hw;

import java.util.Scanner;

/**
 * example input
 * +
 * 5
 * 8
 * <p>
 * 13
 */
public class LessonFourTaskThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        scanner.close();

        System.out.println(calculateResult(numb1, symbol, numb2));
    }

    private static int calculateResult(int number1, String element, int number2) {

        int result = 0;

        switch (element) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                System.out.println("incorrect input symbol");
                break;
        }
        return result;
    }
}


// TODO: 11.08.2021 rename variables
// TODO: 11.08.2021 input validation
