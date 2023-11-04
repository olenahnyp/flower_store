package com.example.demo.decorators;

import com.example.demo.flowers.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasketDecorator implements ItemDecorator {
    private Item item;
    @Override
    public String getDescription() {
        return "Your bucket is decorated with basket";
    }
    public double getPrice() {
        final int MyBasketPrice = 4;
        return MyBasketPrice + this.item.getPrice();
    }
}