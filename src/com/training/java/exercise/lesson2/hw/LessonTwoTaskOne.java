package com.training.java.exercise.lesson2.hw;

public class LessonTwoTaskOne {

    public static void main(String[] args) {

        int a = 60;
        int b = 30;

        if (a + b < 180){
            System.out.print("triangle exist ");

            if (a+b == 90){
                System.out.println("and it is rectangular");
            }

        } else {
            System.out.println("triangle not exist ");
        }

    }
}
