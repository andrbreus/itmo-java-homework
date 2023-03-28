package ru.itmo.homework.hw6;

import java.util.ArrayList;
import java.util.List;

public class MyPermittedProducts {
    private final int maxProtein;
    private final int maxFats;
    private final int maxCarbs;
    private final int maxCalories;
    private final List<Product> productList;

    public MyPermittedProducts(int maxProtein, int maxFats, int maxCarbs, int maxCalories) {
        if (maxProtein < 0 || maxFats < 0 || maxCarbs < 0 || maxCalories < 0)
            throw new IllegalArgumentException();

        this.maxProtein = maxProtein;
        this.maxFats = maxFats;
        this.maxCarbs = maxCarbs;
        this.maxCalories = maxCalories;

        productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        List<String> rejectionReasons = new ArrayList<>();

        if (product.getProtein() > maxProtein)
            rejectionReasons.add("Protein content exceeds the maximum");

        if (product.getFats() > maxFats)
            rejectionReasons.add("Fats content exceeds the maximum");

        if (product.getCarbs() > maxCarbs)
            rejectionReasons.add("Carbs content exceeds the maximum");

        if (product.getCalories() > maxCalories)
            rejectionReasons.add("Calories exceed the maximum");

        if (rejectionReasons.size() == 0) {
            productList.add(product);
        } else {
            System.out.println("Product rejected for the following reason(s):");
            rejectionReasons.forEach(reason -> System.out.println("\t" + reason));
        }
    }

    public void printProducts() {
        productList.forEach(System.out::println);
    }
}
