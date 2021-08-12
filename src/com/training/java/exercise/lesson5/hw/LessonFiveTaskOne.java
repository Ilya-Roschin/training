package com.training.java.exercise.lesson5.hw;

import javafx.scene.shape.SVGPath;

import java.util.Scanner;

public class LessonFiveTaskOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("not positive");
        }
    }
}
