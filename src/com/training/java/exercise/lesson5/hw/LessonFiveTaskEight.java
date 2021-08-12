package com.training.java.exercise.lesson5.hw;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.scenario.effect.impl.state.AccessHelper;

import javax.swing.*;
import java.util.Scanner;

public class LessonFiveTaskEight {

    public static void main(String[] args) {

        int[] array = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        while (true) {

            int check = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    check++;
                }
            }

            if (check == array.length - 1) {
                break;
            }

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int t;
                    t = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = t;
                }
            }
        }

        for (int element : array) {
            System.out.println(element + ", ");
        }
    }
}
