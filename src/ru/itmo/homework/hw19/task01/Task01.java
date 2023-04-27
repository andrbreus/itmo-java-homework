package ru.itmo.homework.hw19.task01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Task01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // TODO: Используя методы Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        //  2. Найти средний возраст учеников
        //  3. Найти самого младшего ученика
        //  4. Найти самого старшего ученика
        //  5. Собрать учеников в группы по году рождения
        //  6. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (ArrayList)
        //  7. Вывести в консоль всех учеников в возрасте от N до M лет
        //  8. Собрать в список всех учеников с именем=someName
        //  9. Собрать Map<Student.Gender, Integer>, где Student.Gender - пол, Integer - суммарный возраст учеников данного пола
        //     см. метод Collectors.summingInt

        // Как сделать так, чтобы тип ключей был ArrayList<Student>, а не List<Student>
        Map<Student.Gender, List<Student>> studentsGroupedByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(studentsGroupedByGender);

        //Почему здесь приходится использовать mapToLong и не работает просто map?
        OptionalDouble avgStudentAge = students.stream()
                .mapToLong(student -> ChronoUnit.YEARS.between(student.getBirth(), LocalDate.now())).average();

        if (avgStudentAge.isPresent())
            System.out.println(avgStudentAge.getAsDouble());

        Comparator<Student> byBirthDate = (s1, s2) -> {
            if (s1.getBirth().isBefore(s2.getBirth()))
                return -1;
            if (s1.getBirth().isAfter(s2.getBirth()))
                return 1;
            return 0;
        };

        Optional<Student> jungestStudent = students.stream().max(byBirthDate);

        System.out.println(jungestStudent.get());

        Optional<Student> oldestStudent = students.stream().min(byBirthDate);

        System.out.println(oldestStudent.get());


    }
}