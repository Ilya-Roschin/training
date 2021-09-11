package com.training.java.exercise.lesson13.task2;

import com.training.java.exercise.lesson13.task2.models.Aspirant;
import com.training.java.exercise.lesson13.task2.models.Student;

public class Main {

    public static void main(String[] args) {
        Student student[] = new Student[2];
        student[0] = new Aspirant("Vladimir", "name", 12, 10);
        student[1] = new Student("Vladislav", "name", 13, 7);

        for (int i = 0; i < student.length; i++) {
            String firstName = student[i].getFirstName();
            String lastName = student[i].getLastName();
            double averageMark = student[i].getAverageMark();
            int scholarship = student[i].getScholarship();

            System.out.println("First name " + firstName);
            System.out.println("Last name " + lastName);
            System.out.println("averageMark " + averageMark);
            System.out.println("Scholarship " + scholarship + "\n");
        }
    }

}
