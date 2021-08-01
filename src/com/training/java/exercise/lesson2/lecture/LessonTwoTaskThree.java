package com.training.java.exercise.lesson2.lecture;

import static java.lang.Math.pow;

public class LessonTwoTaskThree {

    public static void main(String[] args) {

        int power = -5;

        if (power >= 0) {
            int numb =  (int) pow(2, power);
            System.out.println(numb);
        } else {
            System.out.println("power is wrong");
        }

    }
}
