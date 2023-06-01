package ru.itmo.homework.hw8;

public class ConsoleWriter implements AppLogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
