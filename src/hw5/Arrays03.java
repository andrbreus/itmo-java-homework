package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 10;
        String[] words = new String[n];

        String userInput;
        int i = 0;
        while (i < n && !"exit".equals(userInput = scan.nextLine())) {
            boolean wordIsNew = true;
            for (int j = 0; j < i; j++) {
                if (words[j].equals(userInput)) {
                    wordIsNew = false;
                    break;
                }
            }

            if (wordIsNew) {
                words[i] = userInput;
                i++;
            }
        }

        System.out.println(Arrays.toString(words));
    }
}
