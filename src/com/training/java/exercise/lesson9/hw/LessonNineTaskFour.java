package com.training.java.exercise.lesson9.hw;


import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 * https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java
 */
public class LessonNineTaskFour {

    public static void main(String[] args) {

        String eff = "fefefe";
        String result = accum(eff);
        System.out.println(result);
    }


    public static String accum(String s) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        StringBuilder sBuilder = new StringBuilder(s);
        String temp = "";
        while (i < sBuilder.length()) {
            if (i != 0) {
                result.append('-');
            }
            for (int j = i; j >= 0; j--) {
                if (j == i) {
                    temp = toUpperCase(sBuilder.charAt(i));
                } else {
                    temp = toLowerCase(sBuilder.charAt(i));
                }
                result.append(temp);
            }
            i++;
        }
        return result.toString();
    }
}
