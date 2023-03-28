package ru.itmo.homework.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        if (month == 12 || (month >= 1 && month <= 2)) {
            System.out.println("winter");
        } else if (month > 2 && month <= 5) {
            System.out.println("spring");
        } else if (month > 5 && month <= 7) {
            System.out.println("summer");
        } else if (month > 7 && month <= 11) {
            System.out.println("autumn");
        } else {
            System.out.println("invalid input");
        }
    }
}
