package ru.itmo.homework.hw6;

public class Mountain {
    private final String name;
    private final String country;
    private final int height;

    public Mountain(String name, String country, int height) {

        if (name == null || name.length() < 4) {
            throw new IllegalArgumentException("Mountain name length must be at least 4");
        } else if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Country length must be at least 4");
        } else if (height < 100) {
            throw new IllegalArgumentException("Mountain height must be at least 100");
        }

        this.name = name;
        this.country = country;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " (" + country + ", " + height + "m)";
    }
}
