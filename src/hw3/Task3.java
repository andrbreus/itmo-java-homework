package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int plates = scan.nextInt();
        double detergent = scan.nextDouble();

        while (plates > 0 && detergent >= 0.5) {
            plates--;
            detergent -= 0.5;
            System.out.println("Detergent left: " + detergent);
        }

        System.out.println("Plates left: " + plates);
        System.out.println("Detergent left: " + detergent);
    }
}
