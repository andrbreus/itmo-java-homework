package ru.itmo.homework.hw7;

public class Task {
    public static void main(String[] args) {
        var car01 = new Car("123xyz", "green");
        var car02 = new Car("456xyz", "black");
        var car03 = new Car("986xyz", "red");
        var train = new Train("999opo", 7);
        var bus = new Bus("789qwe", "white");

        Vehicle[] vehiclesToRepair = {car01, car02, car03, train, bus};

        for (Vehicle vehicle : vehiclesToRepair) {
            vehicle.setWear((int) (Math.random() * 50));
        }

        var workshop = new Workshop();

        for (Vehicle vehicle : vehiclesToRepair) {
            workshop.addItemToRepairQueue(vehicle);
        }

        System.out.println("Before repair:");

        for (Vehicle vehicle : vehiclesToRepair) {
            System.out.println(vehicle);
        }

        workshop.repairAll();
        System.out.println("After repair");

        for (Vehicle vehicle : vehiclesToRepair) {
            System.out.println(vehicle);
        }
    }
}
