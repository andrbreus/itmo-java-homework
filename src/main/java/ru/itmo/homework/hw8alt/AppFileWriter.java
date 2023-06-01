package ru.itmo.homework.hw8alt;

public class AppFileWriter implements Writer {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
