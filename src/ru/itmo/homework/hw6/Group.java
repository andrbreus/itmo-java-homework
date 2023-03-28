package ru.itmo.homework.hw6;

import java.util.List;

public class Group {
    private final int capacity;
    private final List<Alpinist> alpinists;
    private final Mountain mountain;

    public Group(int capacity, List<Alpinist> alpinists, Mountain mountain) {
        if (alpinists.size() > capacity) {
            throw new IllegalArgumentException();
        }

        this.capacity = capacity;
        this.alpinists = alpinists;
        this.mountain = mountain;
    }

    public Mountain getMountain() {
        return mountain;
    }

    public List<Alpinist> getAlpinists() {
        return alpinists;
    }

    boolean hasVacantPlaces() {
        return capacity > alpinists.size();
    }

    void addAlpinist(Alpinist alpinist) {
        if (!hasVacantPlaces()) {
            throw new IndexOutOfBoundsException("Max capacity is reached");
        }

        alpinists.add(alpinist);
    }

    @Override
    public String toString() {
        return "Mountain: " + mountain + "; " +
                "Alpinists: " + alpinists.toString() + "; " +
                "Has vacant places: " + hasVacantPlaces();
    }
}
