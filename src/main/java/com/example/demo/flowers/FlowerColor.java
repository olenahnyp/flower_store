package com.example.demo.flowers;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    private String value;

    FlowerColor(String value) {
        this.value = value;
    }

    @JsonValue
    public String toString() {
        return value;
    }
}
