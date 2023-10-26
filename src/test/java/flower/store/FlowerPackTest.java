package flower.store;

import com.example.demo.flowers.Flower;
import com.example.demo.flowers.FlowerPack;
import com.example.demo.flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerPackTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower();
        FlowerType flowerType = FlowerType.TULIP;
        flower.setFlowerType(flowerType);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flowerPack = new FlowerPack(flower, quantity);
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(flower.getPrice() *
                flowerPack.getQuantity(), flower.getPrice());
    }

    @Test
    public void testQuantity() {
        int newQuantity = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flowerPack.setQuantity(newQuantity);
        Assertions.assertEquals(newQuantity, flowerPack.getQuantity());
    }
}