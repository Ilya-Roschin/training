package com.training.java.exercise.lesson8.hw;

public class LessonEightTaskFour {

    public static void main(String[] args) {

        run();
    }

    private static String returnNewString(String string) {
        String stringResult = "";
        stringResult += string.charAt(7);
        stringResult += string.charAt(3);
        stringResult += string.charAt(4);
        stringResult += string.charAt(7);
        return stringResult;
    }

    private static void run() {
        String string = "информатика";
        String result = returnNewString(string);
        System.out.println(result);
    }
}

