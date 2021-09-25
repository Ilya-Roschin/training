package com.training.java.exercise.lesson14.lowLevel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {

    public int numberOfDigits(String userString) {
        int result = 0;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(userString);
        while (matcher.find()) {
            result++;
        }
        return result;
    }
}

// TODO: 16.09.2021 переделать с регулярными выражениями