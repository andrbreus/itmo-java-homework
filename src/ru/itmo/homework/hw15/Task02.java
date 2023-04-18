package ru.itmo.homework.hw15;

import java.util.*;

public class Task02 {

    private static List<String> getLoginsByCity(Map<String, String> loginsToCitiesMap, String city) {
        List<String> logins = new ArrayList<>();

        for (Map.Entry<String, String> entry : loginsToCitiesMap.entrySet()) {
            if (entry.getValue().equals(city))
                logins.add(entry.getKey());
        }

        return logins;
    }
    private static Map<String, Integer> countRepeatingWords(List<String> words) {
        Map<String, Integer> counter = new HashMap<>();

        for (String word : words)
            counter.put(word, counter.getOrDefault(word, 0) + 1);

        Iterator<Map.Entry<String, Integer>> counterIterator = counter.entrySet().iterator();

        while (counterIterator.hasNext())
            if (counterIterator.next().getValue() < 2)
                counterIterator.remove();

        return counter;
    }

    private static Map<String, Long> wordFrequency(String text, String targetWord) {
        long count = 0;

        for (String word : text.split(" ")) {
            if (word.equals(targetWord)) count++;
        }

        Map<String, Long> res = new HashMap<>();
        res.put(targetWord, count);

        return res;
    }

    private static Map<Integer, List<String>> groupWordsByFrequency(String text) {
        Map<String, Integer> wordsCounter = new HashMap<>();

        for (String word : text.split(" "))
            wordsCounter.put(word, wordsCounter.getOrDefault(word, 0) + 1);

        Map<Integer, List<String>> wordsGroupedByFrequency = new HashMap<>();

        for (Map.Entry<String, Integer> entry : wordsCounter.entrySet()) {
            int frequency = entry.getValue();
            String word = entry.getKey();

            if (!wordsGroupedByFrequency.containsKey(frequency))
                wordsGroupedByFrequency.put(frequency, new ArrayList<>());
            wordsGroupedByFrequency.get(frequency).add(word);
        }

        return wordsGroupedByFrequency;
    }

    private static void print10MostFrequentWords(String text) {
        Map<String, Integer> wordCounter = new HashMap<>();

        for (String word : text.split(" "))
            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);

        TreeSet<Map.Entry<String, Integer>> sortedMapEntries =
                new TreeSet<>(new Comparator<>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                        if (entry1.getValue().equals(entry2.getValue()))
                            return (-1) * entry1.getKey().compareTo(entry2.getKey());
                        return entry1.getValue().compareTo(entry2.getValue());
                    }
                });

        sortedMapEntries.addAll(wordCounter.entrySet());

        Map.Entry<String, Integer> entry;
        int count = 0;
        while ((entry = sortedMapEntries.pollLast()) != null && count < 10) {
            System.out.println(entry.getKey());
            count++;
        }
    }

    public static void main(String[] args) {
        // FIXME:: В решениях не использовать lambda выражения и stream API

        // TODO (2.1) написать статический метод, который принимает на вход map (например, firstTaskMap) и город (например, city),
        //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";

        System.out.println(getLoginsByCity(firstTaskMap, city));

        // TODO (2.2) дан список слов (например, words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов в списке
        //  в map вида Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

        System.out.println(countRepeatingWords(words));


        // TODO (2.3) Задания по тексту (например, text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
        //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

        String textToTestOrder = "a a a a a a bb cc dd";

        System.out.println(wordFrequency(text, "it"));
        System.out.println(groupWordsByFrequency(text));
        print10MostFrequentWords(text);
        print10MostFrequentWords(textToTestOrder);
    }
}