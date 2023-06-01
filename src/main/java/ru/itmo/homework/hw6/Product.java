package ru.itmo.homework.hw6;

public class Product {
    private String name;
    private int protein;
    private int fats;
    private int carbs;
    private int calories;

    public Product() {}

    public Product(String name) {
        setName(name);
    }

    public Product(String name, int protein, int fats, int carbs) {
        setName(name);
        setProtein(protein);
        setFats(fats);
        setCarbs(carbs);
    }

    public Product(String name, int protein, int fats, int carbs, int calories) {
        this(name, protein, fats, carbs);
        setCalories(calories);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public void setFats(int fats) {
        if (fats < 0)
            throw new IllegalArgumentException();
        this.fats = fats;
    }

    public void setProtein(int protein) {
        if (protein < 0)
            throw new IllegalArgumentException();
        this.protein = protein;
    }

    public void setCarbs(int carbs) {
        if (carbs < 0)
            throw new IllegalArgumentException();
        this.carbs = carbs;
    }

    public void setCalories(int calories) {
        if (calories < 0)
            throw new IllegalArgumentException();
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getProtein() {
        return protein;
    }

    public int getFats() {
        return fats;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return name;
    }
}
