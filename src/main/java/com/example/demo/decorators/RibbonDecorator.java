package com.example.demo.decorators;

import com.example.demo.flowers.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }
    public double getPrice() {
        return super.getPrice() + 40;
    }
    public String getDescription() {
        return "Your bucket is decorated with ribbon";
    }
}
