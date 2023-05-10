package ru.itmo.homework.exams.exam1;

import java.time.LocalDate;

public class Subscription {
    private int id;
    LocalDate registrationDate;
    LocalDate expirationDate;
    Person owner;
    SubscriptionType subscriptionType;

    static enum SubscriptionType {
        oneTime, dayOnly, full
    }
}
