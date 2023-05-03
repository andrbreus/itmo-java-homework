package ru.itmo.homework.hw20.task04;

import java.util.function.Predicate;

public interface RulePredicate extends Predicate<String> {
    default Predicate<String> andRule(Predicate<String> other) {
        return Predicate.super.and(other);
    }
}
