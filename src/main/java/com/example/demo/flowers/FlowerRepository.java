package com.example.demo.flowers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
