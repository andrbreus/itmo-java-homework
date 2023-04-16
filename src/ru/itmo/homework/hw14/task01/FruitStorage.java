package ru.itmo.homework.hw14.task01;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {
    private ArrayList<Fruit> fruits; // коллекция для хранения фруктов (коллекцию выбрать самостоятельно)

    private int overallCount;


    public FruitStorage() {
        fruits = new ArrayList<>(); // коллекция для хранения фруктов (коллекцию выбрать самостоятельно)
    }

    public void addFruit(Fruit newFruit) { // добавление фрукта newFruit в коллекцию fruits
        // newFruit не может быть null
        // newFruit не может быть ссылкой на элемент коллекции
        // Если в коллекции fruits уже есть фрукт с типом и ценой, как у newFruit, увеличивать значение свойства count
        // фрукта из коллекции на значение свойства count объекта newFruit
        // В противном случае просто добавлять newFruit в коллекцию fruits
        if (newFruit == null) return;

        for (Fruit fruit : fruits) {
            if (fruit == newFruit) return;
            if (fruit.equals(newFruit)) {
                fruit.setCount(fruit.getCount() + newFruit.getCount());
                overallCount += newFruit.getCount();
                return;
            }
        }
        fruits.add(newFruit);
        overallCount += newFruit.getCount();
    }

    public int getNumberOfFruitsByType(Fruit.FruitType fruitType) {
        // возвращает количество фруктов типа fruitType
        int count = 0;

        for (Fruit fruit : fruits)
            if (fruit.getType().equals(fruitType)) count += fruit.getCount();

        return count;
    }

    public int getNumberOfFruits() {
        // возвращает количество всех фруктов
        return overallCount;
    }

    public void increasePrice(int value) {
        // value может быть в диапазоне [10; 30)
        // увеличить цену фруктов на value процентов
        if (value < 10 || value >= 30) return;

        for (Fruit fruit : fruits) {
            fruit.setPrice(fruit.getPrice() * (100 + value) / 100);
        }
    }

    public double getFruitsPrice() {
        // возвращает общую стоимость фруктов на складе
        int sum = 0;

        for (Fruit fruit : fruits) {
            sum += fruit.getCount() * fruit.getPrice();
        }

        return sum;
    }

    public List<Fruit> getFruitsByTypeAndPrice(Fruit.FruitType fruitType, int maxPrice) {
        // maxPrice должна быть положительной
        // возвращает список, в который войдут фрукты из коллекции fruits с типом fruitType и ценой не выше maxPrice
        if (maxPrice < 0) throw new IllegalArgumentException("maxPrice < 0");

        List<Fruit> res = new ArrayList<>();

        for (Fruit fruit : fruits) {
            if (fruit.getType().equals(fruitType) && fruit.getPrice() <= maxPrice)
                res.add(fruit);
        }
        return res;
    }
}
