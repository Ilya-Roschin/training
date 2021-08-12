package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskEleven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        switch (N) {
            case (11):
                System.out.print("валет ");
                break;
            case (12):
                System.out.print("дама ");
                break;
            case (13):
                System.out.print("король ");
                break;
            case (14):
                System.out.print("туз ");
                break;
            default:
                if (N >= 6 && N <= 10) {
                    System.out.println(N + " ");
                } else {
                    System.out.println("incorrect dignity lear ");
                }
                break;
        }

        switch (M) {
            case (1):
                System.out.print("пики ");
                break;
            case (2):
                System.out.print("трефы ");
                break;
            case (3):
                System.out.print("бубны ");
                break;
            case (4):
                System.out.print("черви ");
                break;
            default:
                System.out.print("incorrect lear ");
                break;
        }
    }
}
