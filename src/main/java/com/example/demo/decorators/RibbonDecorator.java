package com.example.demo.decorators;

import com.example.demo.flowers.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }
    public double getPrice() {
        final double RIBBON_PRICE = 40;
        return super.getPrice() + RIBBON_PRICE;
    }
    public String getDescription() {
        return "Your bucket is decorated with ribbon";
    }
}
