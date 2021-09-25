package com.training.java.exercise.lesson15.project;


import com.training.java.exercise.lesson15.project.menu.ApplicationMenu;

public class Main {

    public static void main(String[] args) {

        ApplicationMenu applicationMenu = new ApplicationMenu();
        while (true) {
            try {
                applicationMenu.printMenu();
                int choice = applicationMenu.readMenu();
                applicationMenu.makeChoice(choice);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
