package decorators;

import com.example.demo.decorators.RibbonDecorator;
import com.example.demo.flowers.Flower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class RibbonDecoratorTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private RibbonDecorator ribbonDecorator;
    @BeforeEach
    public void init() {
        flower = new Flower();
        ribbonDecorator = new RibbonDecorator(flower);
    }
    @Test
    public void testGetPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int ribbonPrice = 40;
        flower.setPrice(price);
        Assertions.assertEquals(ribbonDecorator.getPrice(), ribbonPrice + price);
    }
    @Test
    public void testGetDescription() {
        Assertions.assertEquals(ribbonDecorator.getDescription(), "Your bucket is decorated with ribbon");
    }
}

