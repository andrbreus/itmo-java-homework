package ru.itmo.homework.hw7;

public abstract class Vehicle implements Repairable {
    protected final String number;
    protected int wear;
    protected String color;

    public Vehicle(String number, String color) {
        this.number = number;
        this.color = color;
    }

    public final String getColor() {
        return color;
    }

    public void setWear(int wear) {
        if (wear > 0) {
            this.wear = wear;
        } else {
            wear = 0;
        }
    }

    public final String getNumber() {
        return number;
    }

    @Override
    public void repair() {
        if (wear >= 10) {
            wear -= 10;
        } else {
            wear = 0;
        }

        additionalRepair();
    }

    protected abstract void additionalRepair();

    @Override
    public String toString() {
        return "{ number: " + number + ", " +
                "color: " + color + ", " +
                "wear: " + wear + "}";
    }
}
