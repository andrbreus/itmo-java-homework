package ru.itmo.homework.hw18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task {
    public static void main(String[] args) {
        University university = new University();
        Course course01 = new Course("Math", 4, 250);
        Course course02 = new Course("Chemistry", 5, 275);
        Course course03 = new Course("Introduction to Computer Science", 6, 300);
        Course course04 = new Course("Social anthropology", 3, 160);
        Course course05 = new Course("Mindfulness", 5, 160);

        university.addCourses(new ArrayList<>(Arrays.asList(course01, course02, course03, course04, course05)));

        System.out.println(university.getCourses());
        university.sortByDurationAndPrice(null);
        System.out.println(university.getCourses());

        Predicate<Course> deletePython = course -> "python".equals(course.getName());
        Predicate<Course> deleteByDurationAndPrice = course -> course.getDuration() < 3 && course.getPrice() < 20000;

        Function<Integer, String> addRubles = number -> {
            if (number > 0) return number + " p.";
            throw new IllegalArgumentException();
        };
    }

    public static <T, R> Function<T, R> task4(Predicate<T> condition, Function<T, R> ifTrue, Function<T, R> ifFalse) {
        return t -> {
            if (condition.test(t)) return ifTrue.apply(t);
            return ifFalse.apply(t);
        };
    }
}
