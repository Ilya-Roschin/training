package com.training.java.exercise.lesson9.project.SwitchStatement;

import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

        int userNumber = enterNumber();
        switch (userNumber) {
            case 1:
                System.out.println("You have chosen a square");
                break;
            case 2:
                System.out.println("You have chosen a circle");
                break;
            case 3:
                System.out.println("You have chosen a triangle");
                break;
            case 4:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
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
