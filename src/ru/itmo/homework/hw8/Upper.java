package ru.itmo.homework.hw8;

public class Upper extends Formatter {
    public Upper(AppLogger appLogger) {
        super(appLogger);
    }

    public Upper(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String format(String message) {
        return message.toUpperCase();
    }
}
