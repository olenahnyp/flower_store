package com.example.demo.flowers;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
    @Override
    public String getDescription() {
        return "This is flower bucket";
    }
}
