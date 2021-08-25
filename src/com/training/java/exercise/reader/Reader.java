package com.training.java.exercise.reader;

import java.util.Scanner;

public class Reader {

    private final Scanner scanner = new Scanner(System.in);

    public double readDoubleFromConsole() {
        return scanner.nextDouble();
    }

    public int readIntFromConsole() {
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }
}
