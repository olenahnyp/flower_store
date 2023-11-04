package com.example.demo.decorators;

import com.example.demo.flowers.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaperDecorator implements ItemDecorator {
    private Item item;
    @Override
    public String getDescription() {
        return "Your bucket is decorated with paper";
    }
    public double getPrice() {
        final int MyPaperPrice = 13;
        return MyPaperPrice + this.item.getPrice();
    }
}
