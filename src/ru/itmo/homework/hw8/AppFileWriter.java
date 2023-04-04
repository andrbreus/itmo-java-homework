package ru.itmo.homework.hw8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppFileWriter implements AppLogger {
    @Override
    public void log(String message) {
        try {
            Files.writeString(Paths.get("log.txt"), message, StandardOpenOption.APPEND);
            // "данные" будут записаны в конец (StandardOpenOption.APPEND) файла "file-name.txt"
        } catch (IOException e) {
            System.out.println("Данные не были записаны");
            e.printStackTrace();
        }
    }
}
