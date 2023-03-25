package hw4;

import java.util.Scanner;

public class Strings01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;

        while (!"exit".equals(userInput = scan.nextLine().strip())) {
            System.out.println(userInput.substring(0, 1).toUpperCase() +
                    userInput.substring(1));
        }
    }
}
