package ru.itmo.homework.hw6;

public class Alpinist {
    private final String name;
    private final String address;

    public Alpinist(String name, String address) {

        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Name length must be at least 3");
        } else if (address == null || address.length() < 5) {
            throw new IllegalArgumentException("Address length must be at least 5");
        }

        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name;
    }
}
