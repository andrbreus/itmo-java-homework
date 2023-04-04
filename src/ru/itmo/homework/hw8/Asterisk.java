package ru.itmo.homework.hw8;

public class Asterisk extends Formatter {
    public Asterisk(AppLogger appLogger) {
        super(appLogger);
    }

    public Asterisk(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String format(String message) {
        return "***" + message + "***";
    }
}
