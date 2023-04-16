package ru.itmo.homework.hw14.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task03 {
    private static class EmployeeNameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee a, Employee b) {
            return a.getName().compareTo(b.getName());
        }
    }

    private static class EmployeeSalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee a, Employee b) {
            if (a.getSalary() == b.getSalary()) return 0;
            return a.getSalary() < b.getSalary() ? -1 : 1;
        }
    }

    private static class EmployeeAgeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee a, Employee b) {
            if (a.getAge() == b.getAge()) return 0;
            return a.getAge() < b.getAge() ? -1 : 1;
        }
    }

    private static class EmployeeCompanyComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee a, Employee b) {
            return a.getCompany().compareTo(b.getCompany());
        }
    }

    public static void main(String[] args) {
        // 1. Дописать класс Employee
        List<Employee> employeeList = Employee.employeeGenerator(20);

        // 2. Отсортировать employeeList:
        // 2.1. по имени
        // 2.2. по имени и зп
        // 2.3. по имени, зп, возрасту, компании

        // Для сортировки используйте тип Comparator

        System.out.println(employeeList);

        Comparator<Employee> byName = new EmployeeNameComparator();
        Comparator<Employee> bySalary = new EmployeeSalaryComparator();
        Comparator<Employee> byAge = new EmployeeAgeComparator();
        Comparator<Employee> byCompany = new EmployeeCompanyComparator();

        List<Employee> employeeListSortedByName = new ArrayList<>(employeeList);
        Collections.sort(employeeListSortedByName, byName);
        System.out.println(employeeListSortedByName);

        List<Employee> employeeListSortedByNameAndAge = new ArrayList<>(employeeList);
        Collections.sort(employeeListSortedByNameAndAge, byName.thenComparing(byAge));
        System.out.println(employeeListSortedByNameAndAge);

        List<Employee> employeeListSortedByNameSalaryAgeCompany = new ArrayList<>(employeeList);
        Collections.sort(employeeListSortedByNameSalaryAgeCompany, byName
                .thenComparing(bySalary)
                .thenComparing(byAge)
                .thenComparing(byCompany));

        System.out.println(employeeListSortedByNameSalaryAgeCompany);
    }
}
