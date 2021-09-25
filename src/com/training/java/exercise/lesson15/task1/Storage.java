package com.training.java.exercise.lesson15.task1;



import java.util.ArrayList;
import java.util.List;


public class Storage implements Info{
    List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> findAll() {
        return students;
    }

    @Override
    public void getInfoOfGoodStudents() {
        findAll().stream().filter(x -> x.getMark() >= 9).forEach(System.out::println);

    }
}
