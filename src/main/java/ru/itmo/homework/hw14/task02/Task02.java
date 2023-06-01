package ru.itmo.homework.hw14.task02;

import java.util.*;

public class Task02 {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        HashMap<Message.MessagePriority, Integer> counter = new HashMap<>();
        for (Message message : messageList) {
            counter.put(message.getPriority(),
                    counter.getOrDefault(message.getPriority(), 0) + 1);
        }

        System.out.println("Количество сообщений для каждого приоритета:");
        counter.forEach((k, v) -> System.out.print(k + ": " + v + "; "));
        System.out.println();
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        Map<Integer, Integer> counter = new HashMap<>();

        for (Message message : messageList) {
            counter.put(message.getCode(), counter.getOrDefault(message.getCode(), 0) + 1);
        }

        System.out.println("Количество сообщений для каждого кода сообщения:");
        counter.forEach((k, v) -> System.out.print(k + ": " + v + "; "));
        System.out.println();
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль

        System.out.println("Количество уникальных сообщений:");
        System.out.println(new HashSet<>(messageList).size());
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return new ArrayList<>(new LinkedHashSet<>(messageList));
    }

    public static void removeEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println(messageList);

        Iterator<Message> messageIterator = messageList.iterator();
        while (messageIterator.hasNext()) {
            if (messageIterator.next().getPriority().equals(priority))
                messageIterator.remove();
        }

        System.out.println(messageList);
    }

    public static void removeOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println(messageList);

        Iterator<Message> messageIterator = messageList.iterator();
        while (messageIterator.hasNext()) {
            if (!messageIterator.next().getPriority().equals(priority))
                messageIterator.remove();
        }

        System.out.println(messageList);
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        countEachPriority(messages);
        countEachCode(messages);
        uniqueMessageCount(messages);
        System.out.println(uniqueMessagesInOriginalOrder(messages));
        removeEach(messages, Message.MessagePriority.HIGH);
        removeOther(messages, Message.MessagePriority.LOW);
    }
}