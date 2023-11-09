package com.example.demo.decorators;

import com.example.demo.flowers.Item;

public class DiscountDecorator extends ItemDecorator {
    public DiscountDecorator(Item item) {
        super(item);
    }
    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
