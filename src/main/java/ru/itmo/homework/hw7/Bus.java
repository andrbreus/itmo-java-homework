package ru.itmo.homework.hw7;

public class Bus extends Vehicle {
    boolean wifi;

    public Bus(String number, String color) {
        super(number, color);
        this.wifi = false;
    }

    public Bus(String number, String color, boolean wifi) {
        super(number, color);
        this.wifi = wifi;
    }

    @Override
    protected void additionalRepair() {
        wifi = true;
    }
    @Override
    public String toString() {
        return "Bus " + super.toString();
    }

}
