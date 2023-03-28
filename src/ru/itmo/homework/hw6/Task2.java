package ru.itmo.homework.hw6;

public class Task2 {
    public static void main(String[] args) {
        var product01 = new Product();
        var product02 = new Product("Bread");
        var product03 = new Product("Celery", 20, 45, 10);
        var product04 = new Product("Tzimmes", 250, 250, 250, 170);

        var permittedProducts = new MyPermittedProducts(100, 240, 150, 300);

        permittedProducts.addProduct(product02);
        permittedProducts.addProduct(product03);
        permittedProducts.addProduct(product04);

        permittedProducts.printProducts();
    }
}
