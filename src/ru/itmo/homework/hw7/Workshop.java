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

    public void addItemToRepairQueue(Repairable itemToRepair) {
        if (index < CAPACITY) repairQueue[index] = itemToRepair;
        index++;
    }

    public void repairAll() {
        for (int i = 0; i < index; i++) {
            Repairable itemToRepair = repairQueue[i];
            itemToRepair.repair();

            if (itemToRepair instanceof Recolorable) {
                String oldColor = ((Recolorable) itemToRepair).getColor();

                int newColorIndex = getRandomColorIndex();
                while (colors[newColorIndex].equals(oldColor)) {
                    newColorIndex = getRandomColorIndex();
                }
                ((Recolorable) itemToRepair).recolor(colors[newColorIndex]);
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
