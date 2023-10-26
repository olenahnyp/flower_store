package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "Payed " + price + " dollars using pay pal";
    }
}
