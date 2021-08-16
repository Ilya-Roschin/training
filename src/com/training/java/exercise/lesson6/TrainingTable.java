package com.training.java.exercise.lesson6;

import java.util.Random;
import java.util.Scanner;

public class TrainingTable {

    public static void main(String[] args) {

        System.out.println("Привет давай научимся считать ");

        int numb1 = 0;
        int numb2 = 0;
        Random random = new Random();
        int repeats = 0;
        int mistake = 0;

        Scanner scan = new Scanner(System.in);


        while (repeats < 2 && mistake < 5) {

            numb1 = random.nextInt(10);
            numb2 = random.nextInt(10);
            System.out.print(numb1 + " * " + numb2 + " = ");
            int result = scan.nextInt();
            if (result == numb1 * numb2) {
                System.out.println("Верно");
                repeats = 0;
            } else {
                mistake++;
                repeats++;
                System.out.println("Неверно");
            }
        }
        scan.close();
    }


}

