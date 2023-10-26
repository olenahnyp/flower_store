package com.example.demo.flowers;

import lombok.*;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;
    public Flower(Flower flower) {
    }

    public String getColor() {
        return color.toString();
    }
}