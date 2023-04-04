package ru.itmo.homework.hw8;

import java.util.ArrayList;
import java.util.List;

public abstract class Formatter implements AppLogger {
    AppLogger appLogger;
    List<Formatter> formatterList;

    public Formatter(AppLogger appLogger) {
        this.appLogger = appLogger;
        this.formatterList = new ArrayList<>();
    }

    public Formatter(Formatter formatter) {
        appLogger = formatter.appLogger;
        formatterList = formatter.formatterList;
        formatterList.add(formatter);
    }

    @Override
    public void log(String message) {

        for (Formatter formatter : formatterList) {
            message = formatter.format(message);
        }

        message = format(message);
        appLogger.log(message);
    }

    public abstract String format(String message);
}
