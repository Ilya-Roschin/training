package com.training.java.exercise.lesson11.codeWarsHw;

import java.util.Locale;

/**
 * https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
 */
public class LessonElevenTaskOne {

    public static boolean  isIsogram(String str) {

        String lowString = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j && lowString.charAt(i) == (lowString.charAt(j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
