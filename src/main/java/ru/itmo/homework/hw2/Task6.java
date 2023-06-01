package ru.itmo.homework.hw2;

public class Task6 {
    public static void main(String[] args) {
        int sum = 12_000;
        int saleCode = 6424;

        double discountedSum = switch (saleCode) {
            case 4525 -> sum * 0.7;
            case 6424, 7012 -> sum * 0.8;
            case 7647, 9011, 6612 -> sum * 0.9;
            default -> sum;
        };

        System.out.println(discountedSum);
    }
}
