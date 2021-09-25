package com.training.java.exercise.lesson15.task1;

public class Main {

    private static final Storage STORAGE = new Storage();

    public static void main(String[] args) {
        initStudents();
        STORAGE.getInfoOfGoodStudents();
    }

    public static void initStudents() {

        Student student1 = new Student("AA", "A", 91111, 9);
        Student student2 = new Student("BB", "B", 91112, 8);
        STORAGE.addStudent(student1);
        STORAGE.addStudent(student2);

    }

}
