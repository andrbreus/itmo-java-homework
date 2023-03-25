package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 10;
        String[] words = new String[n];

        String userInput;
        boolean wordIsNew;
        int wordsAddedCounter = 0;
        for (int i = 0; i < n; i++) {
            userInput = scan.nextLine();

            if ("exit".equals(userInput)) break;

            wordIsNew = true;
            for (int j = 0; j < wordsAddedCounter; j++)
                if (words[j].equals(userInput)) {
                    wordIsNew = false;
                    break;
                }

            if (wordIsNew) {
                words[wordsAddedCounter] = userInput;
                wordsAddedCounter++;
            }
        }

        System.out.println(Arrays.toString(words));
    }
}
