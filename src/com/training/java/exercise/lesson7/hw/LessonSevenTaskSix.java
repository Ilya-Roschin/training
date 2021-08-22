package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

public class LessonSevenTaskSix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number5 = 0;
        int numberMinus10 = 0;
        int number25 = 0;
        int number100 = 0;

        while (true) {
            boolean check = false;
            int userNumber = scanner.nextInt();

            switch (userNumber) {
                case 5:
                    number5++;
                    break;
                case -10:
                    numberMinus10++;
                    break;
                case 25:
                    number25++;
                    break;
                case 100:
                    number100++;
                    break;
                case 0:
                    check = true;
                default:
                    break;
            }
            if (check) {
                break;
            }
        }

        System.out.println("number 5: " + number5 + "\n" + "number -10: " + numberMinus10);
        System.out.println("number 25: " + number25 + "\n" + "number 100: " + number100);
    }
}
