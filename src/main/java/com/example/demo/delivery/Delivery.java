package com.example.demo.delivery;
import com.example.demo.flowers.Item;

import java.util.List;

public interface Delivery {
    public String deliver(List<Item> items);
}
