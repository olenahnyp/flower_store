package com.example.demo.payment;

public class CreditCartPaymentStrategy implements Payment {
    @Override
    public String pay(double price) {
        return "Payed " + price + " dollars using credit card";
    }
}
