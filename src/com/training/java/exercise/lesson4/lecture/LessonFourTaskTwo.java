package com.training.java.exercise.lesson4.lecture;

import java.util.Scanner;

public class LessonFourTaskTwo {

    public static void main(String[] args) {
    int a = readNumber();
    String b = readSymbol();
    int result = 0;

    switch (b) {
        case "+":
           result = a + a;
           break;
        case "-":
            result = a - a;
            break;







    }
        System.out.println(result);
    }


    private static int readNumber() {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        return number;
    }

    private static String readSymbol() {

        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        scanner.close();

        return symbol;
    }

}
