package ru.itmo.homework.hw7;

public class Train extends Vehicle {
    private static final String DEFAULT_TRAIN_COLOR = "green";
    int carriages;

    public Train(String number, int carriages) {
        super(number, DEFAULT_TRAIN_COLOR);
        this.carriages = carriages;
    }

    @Override
    protected void additionalRepair() {
        carriages++;
    }

    @Override
    public String toString() {
        return "Train " + super.toString();
    }
}
