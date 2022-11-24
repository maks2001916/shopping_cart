package com.example.shopping_cart.product;

public class Product {
    private final String name;
    private final int price;
    private final int id;
    private static int counter;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", id=" + id +
                '}';
    }
}
