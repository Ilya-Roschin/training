package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskNine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number == 12 || number == 1 || number == 2) {
            System.out.println("Winter");
        } else if (number > 2 && number < 6) {
            System.out.println("Spring");
        } else if (number >= 6 && number < 9) {
            System.out.println("Summer");
        } else if (number >= 9 && number < 12) {
            System.out.println("autumn");
        } else {
            System.out.println("incorrect number");
        }
    }
}
