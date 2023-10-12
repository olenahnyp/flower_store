package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower tulip;
    private Flower chamomile;
    private FlowerPack flowerPackOne;
    private FlowerPack flowerPackTwo;
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        tulip = new Flower();
        int priceTulip = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        tulip.setPrice(priceTulip);
        chamomile = new Flower();
        int priceChamomile = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        chamomile.setPrice(priceChamomile);

        FlowerType flowerTypeTulip = FlowerType.TULIP;
        FlowerType flowerTypeChamomile = FlowerType.CHAMOMILE;
        tulip.setFlowerType(flowerTypeTulip);
        tulip.setFlowerType(flowerTypeChamomile);

        int quantityTulip = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flowerPackOne = new FlowerPack(tulip, quantityTulip);
        int quantityChamomile = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flowerPackTwo = new FlowerPack(chamomile, quantityChamomile);
        flowerBucket = new FlowerBucket();
    }
    @Test
    public void testPrice() {
        flowerBucket.addFlowerPack(flowerPackOne);
        flowerBucket.addFlowerPack(flowerPackTwo);
        Assertions.assertEquals(flowerPackOne.getPrice() +
                flowerPackTwo.getPrice(), flowerBucket.getPrice());
    }
    @Test
    public void testAddFlowerPack() {
        flowerBucket.addFlowerPack(flowerPackOne);
        List<FlowerPack> flowerPacks = new ArrayList<>();
        flowerPacks.add(flowerPackOne);
        Assertions.assertEquals(flowerPacks, flowerBucket.getFlowerPacks());
    }
}
