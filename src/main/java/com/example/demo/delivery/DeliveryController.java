package com.example.demo.delivery;

import com.example.demo.flowers.Flower;
import com.example.demo.flowers.FlowerColor;
import com.example.demo.flowers.FlowerType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/delivery")
public class DeliveryController {
    @GetMapping("/")
    public String getDelivery() {
        return "Your order will be delivered soon.";
    }
}
