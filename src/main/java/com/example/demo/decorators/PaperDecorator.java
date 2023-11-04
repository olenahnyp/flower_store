package com.example.demo.decorators;

import com.example.demo.flowers.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaperDecorator implements ItemDecorator{
    private Item item;
    @Override
    public String getDescription() {
        return "Your bucket is decorated with paper";
    }
    public double getPrice() {
        final int paperPrice = 13;
        return paperPrice + this.item.getPrice();
    }
}
