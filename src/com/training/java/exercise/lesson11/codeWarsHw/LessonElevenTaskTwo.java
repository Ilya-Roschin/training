package com.training.java.exercise.lesson11.codeWarsHw;

public class LessonElevenTaskTwo {

    private final static int FIRST_INDEX_UPPER_CASE_SYMBOLS = 65;
    private final static int LAST_INDEX_UPPER_CASE_SYMBOLS = 90;
    private final static char SPACE = ' ';

    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != SPACE && ((int) input.charAt(i) >= FIRST_INDEX_UPPER_CASE_SYMBOLS &&
                    (int) input.charAt(i) <= LAST_INDEX_UPPER_CASE_SYMBOLS)) {
             result.append(SPACE);
            }
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}
