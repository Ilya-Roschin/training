package com.training.java.exercise.lesson3.hw;

import com.sun.org.apache.xpath.internal.objects.XString;

import static java.lang.Math.pow;

public class LessonThreeTaskFour {

    public static void main(String[] args) {

        int a = 200;

        System.out.println(calculateMultipl(a));
    }

    public static String calculateMultipl(int number) {

        int rightnumb = 0;
        int mult = 1;

        for (int i = 1; i <= number; i++) {
            int t = (int) pow(i, 2);

            while (t >= 10) {
                t /= 10;
                rightnumb++;
            }

            if (pow(i, 2) % 10 > 0) {
                mult *= pow(i, 2) % 10;
            }
        }

        double leftnumb = mult;

        while (leftnumb >= 10) {
            leftnumb /= 10;
            rightnumb++;
        }

        String result = leftnumb + " * 10 ^ " + rightnumb;

        return result;
    }
}