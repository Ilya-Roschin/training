package com.training.java.exercise.lesson14.lowLevel;

public class TaskTwo {

    public int numberOfDigits(String userString) {
        int result = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) >= 48 && userString.charAt(i) <= 57) {
                result++;
            }
        }
        return result;
    }
}
