package com.training.java.exercise.lesson14.lowLevel;

public class TaskThree {

    public int amountOfNumbers(String userString) {
        String[] strings = userString.split(" ");
        int result = 0;
        for (int i = 0; i < strings.length; i++) {
            boolean check = true;
            int j = 0;
            while (j < strings[i].length()) {
                if (strings[i].charAt(j) <= 48 || strings[i].charAt(j) >= 57) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                result++;
            }
        }
        return result;
    }
}
