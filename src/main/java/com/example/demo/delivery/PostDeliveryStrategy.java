package com.example.demo.delivery;

import com.example.demo.flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public String deliver(List<Item> items) {
        return "Thank you for using Post Delivery!";
    }
}
