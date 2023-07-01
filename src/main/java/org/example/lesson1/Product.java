package org.example.lesson1;

public class Product {
    private String name;
    private Double price;
    private Integer rating;



    public Product(String name, Double price, Integer rating) {
        this.name = name;
        this.price = price;
        if (price < 0) {
            System.out.println("Цена должна быть больше 0");
        } else {
            this.price = price;
        }
        if (rating >= 0 & rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Рейтинг должен быть от 0 до 5");
        }
    }

    public Product() {
        this.name = "None";
        this.price = 0.0;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return '\n' + "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}