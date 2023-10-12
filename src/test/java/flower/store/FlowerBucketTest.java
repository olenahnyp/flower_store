package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucketTest {
    private Flower tulip;
    private Flower chamomile;
    private FlowerPack flowerPackOne;
    private FlowerPack flowerPackTwo;
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        tulip = new Flower();
        tulip.setPrice(2);
        chamomile = new Flower();
        chamomile.setPrice(1);
        FlowerType flowerTypeTulip = FlowerType.TULIP;
        FlowerType flowerTypeChamomile = FlowerType.CHAMOMILE;
        tulip.setFlowerType(flowerTypeTulip);
        tulip.setFlowerType(flowerTypeChamomile);
        flowerPackOne = new FlowerPack(tulip, 10);
        flowerPackTwo = new FlowerPack(chamomile, 5);
        flowerBucket = new FlowerBucket();
    }
    @Test
    public void testPrice() {
        flowerBucket.addFlowerPack(flowerPackOne);
        flowerBucket.addFlowerPack(flowerPackTwo);
        Assertions.assertEquals(25, flowerBucket.getPrice());
    }
    @Test
    public void testAddFlowerPack() {
        flowerBucket.addFlowerPack(flowerPackOne);
        List<FlowerPack> flowerPacks = new ArrayList<>();
        flowerPacks.add(flowerPackOne);
        Assertions.assertEquals(flowerPacks, flowerBucket.getFlowerPacks());
    }
}
