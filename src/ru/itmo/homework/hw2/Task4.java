package ru.itmo.homework.hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        String mark = "";

        if (count <= 100 && count >= 90) mark = "отлично";
        else if (count <= 89 && count >= 60) mark = "хорошо";
        else if (count <= 59 && count >= 40) mark = "удовлетворительно";
        else if (count <= 39 && count >= 0) mark = "попробуйте в следующий раз";

        System.out.println(mark);
;    }
}
