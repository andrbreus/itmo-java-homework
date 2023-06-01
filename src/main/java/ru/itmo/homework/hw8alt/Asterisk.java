package ru.itmo.homework.hw8alt;

public class Asterisk extends FormattedWriter {
    public Asterisk(Writer writer) {
        super(writer);
    }

    @Override
    public String format(String message) {
        return "***" + message + "***";
    }
}
