package com.example.demo.flowers;

import com.example.demo.filter.SearchFilter;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Item> items;
    public List<Item> search(SearchFilter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item: items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}