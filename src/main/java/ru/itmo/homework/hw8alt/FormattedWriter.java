package ru.itmo.homework.hw8alt;

public abstract class FormattedWriter implements Writer {
    protected Writer writer;

    public FormattedWriter(Writer writer) {
        this.writer = writer;
    }

    public abstract String format(String message);

    public void log(String message) {
        writer.log(format(message));
    }
}
