package com.example.demo.filter;
import com.example.demo.flowers.Item;
public interface SearchFilter {
    boolean match(Item item);
}