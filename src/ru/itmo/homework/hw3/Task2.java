package ru.itmo.homework.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int sumOfDigits = 0;

        while (num != 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sumOfDigits);
    }
}
