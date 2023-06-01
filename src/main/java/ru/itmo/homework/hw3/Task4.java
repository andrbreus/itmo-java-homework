package ru.itmo.homework.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomInt = 1 + (int) (Math.random() * 9);

        int guess;
        while ((guess = scan.nextInt()) != randomInt) {
            if (guess == 0) {
                System.out.println("выход из программы");
                System.exit(0);
            }

            if (randomInt > guess) {
                System.out.println("загаданное число больше");
            } else {
                System.out.println("загаданное число меньше");
            }
        }

        System.out.println("Вы угадали");
    }
}
