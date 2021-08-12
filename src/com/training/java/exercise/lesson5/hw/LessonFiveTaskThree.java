package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numb1 = scanner.nextDouble();
        double numb2 = scanner.nextDouble();
        double numb3 = scanner.nextDouble();
        scanner.close();

        if ((numb1 <= numb2 && numb2 <= numb3) || (numb1 >= numb2 && numb2 >= numb3)) {
            numb1 *= 2;
            numb2 *= 2;
            numb3 *= 2;
        } else {
            numb1 = -numb1;
            numb2 = -numb2;
            numb3 = -numb3;
        }

        System.out.println(numb1 + ", " + numb2 + ", " + numb3);
    }
}
