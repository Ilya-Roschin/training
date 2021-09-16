package com.training.java.exercise.lesson14.lowLevel;

public class Main {

    public static void main(String[] args) {

        TaskOne taskOne = new TaskOne();
        TaskTwo taskTwo = new TaskTwo();
        TaskThree taskThree = new TaskThree();
        System.out.println(taskOne.changeWord("wfefe word word word123456 word word"));
        System.out.println(taskTwo.numberOfDigits("1w13reg123424"));
        System.out.println(taskThree.amountOfNumbers("efe efe11 11 123"));
    }
}
