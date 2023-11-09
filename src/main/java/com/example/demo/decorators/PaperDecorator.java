package com.example.demo.decorators;

import com.example.demo.flowers.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }
    public double getPrice() {
        return super.getPrice() + 13;
    }
    public String getDescription() {
        return "Your bucket is decorated with paper";
    }
}
