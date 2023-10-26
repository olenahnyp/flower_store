package com.example.demo.flowers;

import com.example.demo.delivery.Delivery;
import com.example.demo.payment.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Getter @Setter
public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item:items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    public String processOrder() {
        return "Your order is in process...";
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }
}
