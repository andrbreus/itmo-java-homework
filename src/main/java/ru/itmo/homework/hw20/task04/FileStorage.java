package ru.itmo.homework.hw20.task04;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class FileStorage {
    final Set<String> files;
    final Predicate rule;

    public FileStorage(Predicate rule) {
        files = new HashSet<>();
        this.rule = rule;
    }

    public boolean add(String fileName) {
        if (rule.test(fileName)) {
            files.add(fileName);
            return true;
        }

        return false;
    }
}
