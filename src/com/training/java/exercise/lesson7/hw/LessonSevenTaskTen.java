package com.training.java.exercise.lesson7.hw;

public class LessonSevenTaskTen {

    public static void main(String[] args) {

        for (int number = 2; number <= 10000; number++) {

            int sum = 0;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}