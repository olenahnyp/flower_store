package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerPackTest {
    private Flower flower;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower();
        FlowerType flowerType = FlowerType.TULIP;
        flower.setFlowerType(flowerType);
        flowerPack = new FlowerPack(flower, 10);
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(flower.getPrice() * flowerPack.getQuantity(), flower.getPrice());
    }

    @Test
    public void testQuantity() {
        flowerPack.setQuantity(-10);
        Assertions.assertEquals(1, flowerPack.getQuantity());
    }
}