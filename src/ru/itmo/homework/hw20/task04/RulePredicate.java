package ru.itmo.homework.hw20.task04;

import java.util.function.Predicate;

public interface RulePredicate extends Predicate<String> {
    default RulePredicate andRule(RulePredicate other) {
        return (t) -> test(t) && other.test(t);
    }

    default RulePredicate orRule(RulePredicate other) {
        return (t) -> test(t) || other.test(t);
    }
}
