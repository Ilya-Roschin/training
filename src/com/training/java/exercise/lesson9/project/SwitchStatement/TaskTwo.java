package com.training.java.exercise.lesson9.project.SwitchStatement;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        String userString = enterString();
        switch (userString) {
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            case "six":
                System.out.println(6);
                break;
            case "seven":
                System.out.println(7);
                break;
            case "eight":
                System.out.println(8);
                break;
            case "nine":
                System.out.println(9);
                break;
            default:
                System.out.println("error!");
                break;
        }
    }

    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        scanner.close();
        return userString;
    }

    public static int getNumberOfMaxParam(int a, int b, int c) {

        if (a >= b && a >= c) {
            return 1;
        } else if (b >= a && b >= c) {
            return 2;
        } else {
            return 3;
        }
    }


}
