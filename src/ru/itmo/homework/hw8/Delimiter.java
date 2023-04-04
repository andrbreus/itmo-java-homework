package ru.itmo.homework.hw8;

public class Delimiter extends Formatter {
    public Delimiter(AppLogger appLogger) {
        super(appLogger);
    }

    public Delimiter(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String format(String message) {
        return "===" + message + "===";
    }
}
