package ru.itmo.homework.hw20.task03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {
        // Написать реализацию методов task01 - task05
        // Для некоторых решений может пригодиться метод flatMap класса Stream
    }
    public static Double task05(ArrayList<Article> articles){
        // Вернуть средний возраст авторов статей
        return articles.stream()
                .map(Article::getAuthors)
                .map(HashMap::values)
                .flatMap(Collection::stream)
                .mapToLong(author -> ChronoUnit.YEARS.between(author.getBirth(), LocalDate.now()))
                .average()
                .orElse(0);
    }
    public static Author task04(ArrayList<Article> articles, Article.Category category){
        // Вернуть самого молодого автора статей категории == category
        return articles.stream().
                filter(article -> article.getCategory() == category)
                .map(Article::getAuthors)
                .map(HashMap::values)
                .flatMap(Collection::stream)
                .max((a1, a2) -> a1.getBirth().compareTo(a2.getBirth()))
                .orElse(null);
    }
    public static HashSet<String> task03(ArrayList<Article> articles, Article.Category category){
        // Вернуть множество email авторов статей категории == category
        return articles.stream()
                .filter(article -> article.getCategory() == category)
                .map(Article::getAuthors)
                .map(HashMap::keySet)
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(HashSet::new));
    }
    public static Set<Article> task02(ArrayList<Article> articles, Article.Category category, int min, int max){
        // Вернуть множество статей категории == category, возраст авторов которых попадает в диапазон от min до max
        return articles.stream()
                .filter(article -> article.getCategory() == category)
                .filter(article -> article.getAuthors().values().stream()
                        .allMatch(author -> {
                            long authorAge = ChronoUnit.YEARS.between(author.getBirth(), LocalDate.now());
                            return authorAge >= min && authorAge <= max;
                        }))
                .collect(Collectors.toSet());
    }
    public static LinkedList<Article> task01(ArrayList<Article> articles, Article.Category category){
        // Вернуть список статей категории == category, опубликованных сегодня
        return articles.stream()
                .filter(article -> article.getCategory() == category)
                .filter(article -> article.getPublished().getDayOfMonth() == LocalDateTime.now().getDayOfMonth() &&
                        article.getPublished().getYear() == LocalDateTime.now().getYear())
                .collect(Collectors.toCollection(LinkedList::new));
    }
}