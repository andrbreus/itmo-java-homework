package ru.itmo.homework.hw14.task03;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    // TODO: добавить необходимые конструкторы, геттеры, сеттеры и другие методы


    // TODO: дописать реализацию метода для создания списка объектов класса Employee.
    //  Объекты Employee создавать со случайными значениями:
    //  возраст от 21 до 60;
    //  диапазон ЗП на Ваш выбор.
    //  name - случайное значения из массива names
    //  company - случайное значения из массива companies


    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Employee> employeeGenerator(int num) { //  num - количество объектов в списке
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        ArrayList<Employee> employees = new ArrayList<>();

        // создание объектов, наполнение списка

        final int MIN_SALARY = 1000;
        final int MAX_SALARY = 9000;
        final int MIN_AGE = 21;
        final int MAX_AGE = 60;

        for (int i = 0; i < num; i++) {
            employees.add(new Employee(
                    names[(int) (Math.random() * names.length)],
                    companies[(int) (Math.random() * companies.length)],
                     MIN_SALARY + (int) (Math.random() * (MAX_SALARY - MIN_SALARY + 1)),
                    MIN_AGE + (int) (Math.random() * (MAX_AGE - MIN_AGE + 1))
                    ));
        }

        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}