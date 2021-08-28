package com.training.java.exercise.lesson9.project.SwitchStatement;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        int number = enterNumber();
        switch (number) {
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            default:
                System.out.println("do not move");
                break;
        }
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        scanner.close();
        return userNumber;
    }




}
