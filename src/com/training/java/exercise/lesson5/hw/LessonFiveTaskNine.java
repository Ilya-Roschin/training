package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskNine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        String result;

        switch (number) {
            case 1:
            case 2:
            case 12:
                result = "Winter ";
                break;
            case 3:
            case 4:
            case 5:
                result = "Spring ";
                break;
            case 6:
            case 7:
            case 8:
                result = "Summer ";
                break;
            case 9:
            case 10:
            case 11:
                result = "Autumn";
                break;
            default:
                result = "Default month";
                break;
        }

        System.out.println(result);
    }
}
