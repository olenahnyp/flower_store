package com.example.demo.flowers;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Flower extends Item {
    @Id
    private int id;
    private double price;
    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;
    public Flower(Flower flower) {
    }
}