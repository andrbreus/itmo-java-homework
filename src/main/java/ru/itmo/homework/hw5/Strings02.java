package ru.itmo.homework.hw5;

public class Strings02 {
    public static void main(String[] args) {
        String text = "JAVA стоит первым в рейтинге популярности использования языков; " +
                "JAVA один из наиболее мощных высокоуровневых языков программирования; " +
                "JAVA поддерживает большое количество встроенных библиотех, которые позволяют" +
                "быстро писать проекты любого класса сложности; курс «JUNIOR JAVA DEVELOPER» " +
                "предназначен для подготовки программистов-профессионалов, специализирующихся " +
                "на разработке программного обеспечения различного класса и уровня сложности.";

        String editedText = text.replaceAll("JAVA", "PYTHON");
        System.out.println(editedText);
    }
}
