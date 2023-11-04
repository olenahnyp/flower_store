package decorators;

import com.example.demo.decorators.BasketDecorator;
import com.example.demo.flowers.Flower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class BasketDecoratorTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private BasketDecorator basketDecorator;
    @BeforeEach
    public void init() {
        flower = new Flower();
        basketDecorator = new BasketDecorator(flower);
    }
    @Test
    public void testGetPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        final int basketPrice = 4;
        flower.setPrice(price);
        Assertions.assertEquals(basketDecorator.getPrice(), basketPrice + price);
    }
    @Test
    public void testGetDescription() {
        Assertions.assertEquals(basketDecorator.getDescription(), "Your bucket is decorated with basket");
    }
}
