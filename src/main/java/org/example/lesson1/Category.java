package org.example.lesson1;

import java.util.*;

public class Category {
    private String name;
    private HashMap<Product, Integer> products;

    public Category(String name, HashMap<Product, Integer> products) {
        this.name = name;
        this.products = products;
    }

    public Category() {
        this.name = "Unknown";
        this.products = new HashMap<>();
    }

    public Category(String name) {
        this.name = name;
        this.products = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}'+'\n';
    }
}
