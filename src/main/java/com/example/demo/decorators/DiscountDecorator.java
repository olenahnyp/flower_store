package com.example.demo.decorators;

import com.example.demo.flowers.Item;

public class DiscountDecorator extends ItemDecorator {
    public DiscountDecorator(Item item) {
        super(item);
    }
    public double getPrice() {
        final double DISCOUNT = 0.8;
        return super.getPrice() * DISCOUNT;
    }
}
