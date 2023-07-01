package org.example.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Category category1 = new Category("Machine guns");
        Product product1 = new Product("Uzi", 1000.00, 4);
        Product product2 = new Product("M-16", 1500.00, 3);
        Product product3 = new Product("AK-74", 1700.00, 5);
        category1.getProducts().put(product1, 17);
        category1.getProducts().put(product2, 32);
        category1.getProducts().put(product3, 15);
        System.out.println(category1);

        Category category2 = new Category("Guns");
        Product product4 = new Product("Desert Eagle", 600.00, 3);
        Product product5 = new Product("TT", 450.00, 5);
        Product product6 = new Product("Glock 17", 500.00, 4);
        category2.getProducts().put(product4, 345);
        category2.getProducts().put(product5, 43);
        category2.getProducts().put(product6, 2);

        User user1 = new User("Kirill", "777", new Basket());
        user1.getMybasket().setBasketID(1);
        User user2 = new User("Masha", "0000", new Basket());
        user1.getMybasket().setBasketID(2);

        List<Category> Stock = new ArrayList<>();
        Stock.add(category1);
        Stock.add(category2);
        System.out.println("Каталог продуктов");
        for (Category category : Stock) {
            System.out.println(category);
        }

        List<User> Customers = new ArrayList<>();
        Customers.add(user1);
        Customers.add(user2);
        System.out.println("Клиенты");
        for (User customer : Customers) {
            System.out.println(customer);
        }
    }
}
