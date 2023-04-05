package ru.itmo.homework.hw8alt;

public class Upper extends FormattedWriter {
    public Upper(Writer writer) {
        super(writer);
    }

    @Override
    public String format(String message) {
        return message.toUpperCase();
    }
}
