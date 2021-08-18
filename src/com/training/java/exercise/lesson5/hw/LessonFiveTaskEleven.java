package com.training.java.exercise.lesson5.hw;

import java.util.Scanner;

public class LessonFiveTaskEleven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        String dignity;
        String lear;
        switch (n) {
            case 11:
                dignity = "Валет";
                break;
            case 12:
                dignity = "Дама ";
                break;
            case 13:
                dignity = "Король ";
                break;
            case 14:
                dignity = "Туз ";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                dignity = n + " ";
                break;
            default:
                dignity = "incorrect dignity ";
                break;
        }

        switch (m) {
            case 1:
                lear = "Пики ";
                break;
            case 2:
                lear = "Трефы ";
                break;
            case 3:
                lear = "Бубны ";
                break;
            case 4:
                lear = "Черви ";
                break;
            default:
                lear = "incorrect lear ";
                break;
        }
        System.out.println(dignity + lear);
    }
}
