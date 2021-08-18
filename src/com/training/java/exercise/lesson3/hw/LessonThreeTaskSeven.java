package com.training.java.exercise.lesson3.hw;

import com.training.java.exercise.reader.Reader;

import java.util.Scanner;

public class LessonThreeTaskSeven {

    public static void main(String[] args) {

        Reader reader = new Reader();
        int n = reader.readIntFromConsole();
        int m = reader.readIntFromConsole();

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
