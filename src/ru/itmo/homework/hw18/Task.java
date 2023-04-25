package ru.itmo.homework.hw18;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        University university = new University();
        Course course01 = new Course("Math", 130, 250);
        Course course02 = new Course("Chemistry", 100, 275);
        Course course03 = new Course("Introduction to Computer Science", 200, 300);
        Course course04 = new Course("Social anthropology", 150, 160);
        Course course05 = new Course("Mindfulness", 151, 160);

        university.addCourses(new ArrayList<>(Arrays.asList(course01, course02, course03, course04, course05)));

        System.out.println(university.getCourses());
        university.sortByDurationAndPrice(null);
        System.out.println(university.getCourses());
    }
}
