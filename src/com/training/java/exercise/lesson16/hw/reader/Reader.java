package com.training.java.exercise.lesson16.hw.reader;

import java.util.Scanner;

public class Reader {

    private static final Scanner SCANNER = new Scanner(System.in);

    public String readLine(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }

    public int readInt(String message) {
        System.out.println(message);
        return SCANNER.nextInt();
    }
}
