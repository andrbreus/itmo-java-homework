package ru.itmo.homework.hw20.task01;

import ru.itmo.homework.hw18.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ru.itmo.homework.hw18.Course;

public class Task01 {
    public static void main(String[] args) {
        ru.itmo.homework.hw18.Course course01 = new ru.itmo.homework.hw18.Course("Python", 4, 250);
        ru.itmo.homework.hw18.Course course02 = new ru.itmo.homework.hw18.Course("Java", 3, 275);
        ru.itmo.homework.hw18.Course course03 = new ru.itmo.homework.hw18.Course("Python", 6, 300);
        ru.itmo.homework.hw18.Course course04 = new ru.itmo.homework.hw18.Course("Java", 3, 160);
        ru.itmo.homework.hw18.Course course05 = new Course("Haskell", 6, 160);

        List<Course> courses = new ArrayList<>(List.of(course01, course02, course03, course04, course05));

        Map<String, List<Course>> courseMapByName = courses.stream()
                .collect(Collectors.groupingBy(Course::getName));

        courseMapByName.forEach((k, v) -> System.out.println(k + ": " + v));

        Map<Integer, List<Course>> courseMapByDuration = courses.stream()
                .collect(Collectors.groupingBy(Course::getDuration));

        courseMapByDuration.forEach((k, v) -> System.out.println(k + ": " + v));

        Map<String, Long> courseCounterByName = courses.stream()
                .collect(Collectors.groupingBy(Course::getName, Collectors.counting()));

        courseCounterByName.forEach((k, v) -> System.out.println(k + ": " + v));

        Map<String, Map<Integer, List<Course>>> complexCourseMap = courses.stream()
                .collect(Collectors.groupingBy(
                        Course::getName, Collectors.groupingBy(Course::getDuration))
                );

        complexCourseMap.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
