package com.example.demo.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/flower")
public class FlowerController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello!";
    }
    @GetMapping("/list")
    public List<Flower> getFlower() {
        return List.of(new Flower(0, FlowerColor.RED, 0, FlowerType.TULIP));
    }
}
