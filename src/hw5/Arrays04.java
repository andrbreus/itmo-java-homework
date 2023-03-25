package hw5;

public class Arrays04 {
    public static void main(String[] args) {
        String text = "в предложении все слова разной длины";

        String longestWord = "";
        for (String word : text.split(" "))
            if (word.length() > longestWord.length())
                longestWord = word;

        System.out.println(longestWord);
    }
}
