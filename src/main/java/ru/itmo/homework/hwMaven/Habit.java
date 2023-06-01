package ru.itmo.homework.hwMaven;

public class Habit {
    private String name;
    private String description;
    boolean good;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    @Override
    public String toString() {
        return "Habit{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", good=" + good +
                '}';
    }
}
