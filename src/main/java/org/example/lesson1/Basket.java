package org.example.lesson1;

import java.util.HashMap;

public class Basket {
    private Integer basketID;
    private HashMap<Product, Integer> basketContent;

    public Basket() {
        this.basketID = 0;
        this.basketContent = new HashMap<>();
    }

    public Integer getBasketID() {
        return basketID;
    }

    public void setBasketID(Integer basketID) {
        this.basketID = basketID;
    }

    public HashMap<Product, Integer> getBasketContent() {
        return basketContent;
    }

    public void setBasketContent(HashMap<Product, Integer> basketContent) {
        this.basketContent = basketContent;
    }

    public Basket(Integer basketID, HashMap<Product, Integer> basketContent) {
        this.basketID = basketID;
        this.basketContent = basketContent;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketID=" + basketID +
                ", basketContent=" + basketContent +
                '}';
    }
}