package com.example.demo.decorators;

import com.example.demo.flowers.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }
    public double getPrice() {
        return super.getPrice() + 4;
    }
    public String getDescription() {
        return "Your bucket is decorated with basket";
    }
}