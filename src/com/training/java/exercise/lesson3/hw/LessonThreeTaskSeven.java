package com.training.java.exercise.lesson3.hw;

import java.util.Scanner;

public class LessonThreeTaskSeven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        if (n > m) {

            int t;

            t = n;
            n = m;
            m = t;
        }

        while (n <= m) {

            int t = n;

            System.out.print(n + " : ");

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
            n++;
        }
    }
}
