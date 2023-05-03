package ru.itmo.homework.hw20.task04;

import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        RulePredicate rule01 = new RulePredicate() {
            @Override
            public boolean test(String s) {
                return s.length() > 7;
            }
        };

        RulePredicate rule02 = new RulePredicate() {
            @Override
            public boolean test(String s) {
                return s.endsWith(".txt");
            }
        };

        FileStorage fileStorage =
                new FileStorage(rule01.andRule(rule02.andRule(filename -> Character.isUpperCase(filename.charAt(0)))));

        List<String> fileNames = List.of("File.txt", "file.txt", "Song.mp3", "QWERTY.txt", "F.txt");

        for (String fileName : fileNames) {
            if (fileStorage.add(fileName)) System.out.println(fileName + " added!");
        }
    }
}
