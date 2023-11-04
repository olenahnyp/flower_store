package com.example.demo.decorators;

import com.example.demo.flowers.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RibbonDecorator implements ItemDecorator {
    private Item item;
    @Override
    public String getDescription() {
        return "Your bucket is decorated with ribbon";
    }
    public double getPrice() {
        final int MyRibbonPrice = 40;
        return MyRibbonPrice + this.item.getPrice();
    }
}
