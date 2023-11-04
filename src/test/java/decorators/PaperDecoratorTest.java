package decorators;

import com.example.demo.decorators.PaperDecorator;
import com.example.demo.flowers.Flower;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class PaperDecoratorTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private PaperDecorator paperDecorator;
    @BeforeEach
    public void init() {
        flower = new Flower();
        paperDecorator = new PaperDecorator(flower);
    }
    @Test
    public void testGetPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        final int MyPaperPrice = 13;
        flower.setPrice(price);
        Assertions.assertEquals(paperDecorator.getPrice(), MyPaperPrice + price);
    }
    @Test
    public void testGetDescription() {
        Assertions.assertEquals(paperDecorator.getDescription(), 
        "Your bucket is decorated with paper");
    }
}
