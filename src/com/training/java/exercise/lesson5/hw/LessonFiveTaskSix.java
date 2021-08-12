package com.training.java.exercise.lesson5.hw;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class LessonFiveTaskSix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 != 0 && number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else if (number == 0) {
            number = 10;
        }

        System.out.println(number);
    }
}
