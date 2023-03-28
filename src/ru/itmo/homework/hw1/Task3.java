package ru.itmo.homework.hw1;

public class Task3 {
    public static void main(String[] args) {
        int SECONDS_IN_HOUR = 3600;
        double timeHours = 1.5;
        double distanceKM = 8.0;

        double speed = (distanceKM * 1000) / (timeHours * SECONDS_IN_HOUR);

        System.out.println(speed);
    }
}
