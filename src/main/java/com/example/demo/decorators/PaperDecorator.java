package com.example.demo.decorators;

import com.example.demo.flowers.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }
    public double getPrice() {
        final double PAPER_PRICE = 13;
        return super.getPrice() + PAPER_PRICE;
    }
    public String getDescription() {
        return "Your bucket is decorated with paper";
    }
}
