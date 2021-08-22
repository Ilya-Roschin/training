package com.training.java.exercise.lesson7.hw;

import java.util.Scanner;

public class LessonSevenTaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int i = 2;
        boolean check = true;

       while (i < number) {

              if (number % i == 0 && number != i) {
                  check = false;
                  break;
              }
            i++;
        }

       if (check) {
           System.out.println("prime number");
       } else {
           System.out.println("not prime number");
       }
    }
}
