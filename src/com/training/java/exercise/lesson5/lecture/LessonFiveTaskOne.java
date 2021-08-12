package com.training.java.exercise.lesson5.lecture;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class LessonFiveTaskOne {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number > 0) {
            number += 10;
        }

        System.out.println(number);

    }
}
