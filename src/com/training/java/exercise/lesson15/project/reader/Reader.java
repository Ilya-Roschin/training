package com.training.java.exercise.lesson15.project.reader;

import java.util.Scanner;

public class Reader {

    private static final Scanner SCANNER = new Scanner(System.in);

    public String readLine(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }
}
