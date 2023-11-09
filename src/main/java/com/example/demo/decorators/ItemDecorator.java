package com.example.demo.decorators;

import com.example.demo.flowers.Item;

public class ItemDecorator {
    private Item item;
    public ItemDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return item.getDescription();
    }
    public double getPrice() {
        return item.getPrice();
    }
}

