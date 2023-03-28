package ru.itmo.homework.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int left = 2;
        int right = 100;

        int guess;
        int input;
        while (right >= left) {
            guess = (right + left) / 2;
            System.out.println("Число равно " + guess + "?");
            input = scan.nextInt();

            if (input == 1) {
                System.out.println("угадано!");
                break;
            }

            if (input == 0) {
                System.out.println("Число больше " + guess + "?");
                input = scan.nextInt();
                if (input == 1) {
                    left = guess + 1;
                } else {
                    right = guess - 1;
                }
            }
        }

        if (right < left) System.out.println("cheater!");
    }
}
