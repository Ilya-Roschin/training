package com.training.java.exercise.lesson5.lecture;

import java.util.Scanner;

public class LessonFiveTaskSeven {

    public static void main(String[] args) {
        int sum = 0;
        int element;

        Scanner sc = new Scanner(System.in);
        while (true) {
            element = sc.nextInt();
            if (element == 99) {
                break;
            }
            sum += element;
        }
        sc.close();

        System.out.println(sum);

    }
}
