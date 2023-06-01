package ru.itmo.homework.hw7;

public class Car extends Vehicle implements Recolorable {
    public Car(String number, String color) {
        super(number, color);
    }

    @Override
    public void recolor(String newColor) {
        color = newColor;
    }

    @Override
    protected void additionalRepair() {}

    @Override
    public String toString() {
        return "Car " + super.toString();
    }
}
