package com.example.demo.decorators;

import com.example.demo.flowers.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }
    public double getPrice() {
        final double BASKET_PRICE = 4;
        return super.getPrice() + BASKET_PRICE;
    }
    public String getDescription() {
        return "Your bucket is decorated with basket";
    }
}