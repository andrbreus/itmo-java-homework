package ru.itmo.homework.hw8alt;

public class Delimiter extends FormattedWriter {
    public Delimiter(Writer writer) {
        super(writer);
    }

    @Override
    public String format(String message) {
        return "===" + message + "===";
    }
}
