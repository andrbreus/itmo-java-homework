package ru.itmo.homework.hw20.task04;

import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        RulePredicate rule01 = filename -> filename.length() > 7;
        RulePredicate rule02 = filename -> filename.endsWith(".txt");
        RulePredicate rule03 = filename -> filename.endsWith(".log");
        RulePredicate rule04 = filename -> Character.isUpperCase(filename.charAt(0));

        FileStorage storage = new FileStorage(rule01.andRule(rule02.orRule(rule03)).andRule(rule04));
        List<String> fileNames = List.of("File.txt", "file.txt", "Song.mp3", "QWERTY.txt", "F.txt", "Log001.log");

        for (String fileName : fileNames) {
            if (storage.add(fileName)) System.out.println(fileName + " added!");
        }
    }
}
