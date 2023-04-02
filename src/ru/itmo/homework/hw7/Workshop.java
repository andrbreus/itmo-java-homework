package ru.itmo.homework.hw7;

import java.util.Arrays;

public class Workshop {
    private static final int CAPACITY = 10;
    private final String[] colors = {"white", "black", "green", "blue", "cyan", "yellow", "red"};
    private final Repairable[] repairQueue;
    private int index;

    public Workshop() {
        repairQueue = new Repairable[CAPACITY];
        index = 0;
    }

    public void addVehicle(Repairable vehicle) {
        if (index < CAPACITY) repairQueue[index] = vehicle;
        index++;
    }

    public void repairAll() {
        for (int i = 0; i < index; i++) {
            Repairable vehicle = repairQueue[i];
            vehicle.repair();

            if (vehicle instanceof Recolorable) {
                String oldColor = ((Vehicle) vehicle).getColor();

                int newColorIndex = getRandomColorIndex();
                while (colors[newColorIndex].equals(oldColor)) {
                    newColorIndex = getRandomColorIndex();
                }
                ((Recolorable) vehicle).recolor(colors[newColorIndex]);
            }
        }
        Arrays.fill(repairQueue, null);
        index = 0;
    }

    public void printRepairQueue() {
        System.out.println(Arrays.toString(repairQueue));
    }

    private int getRandomColorIndex() {
        return (int) (Math.random() * colors.length);
    }
}
