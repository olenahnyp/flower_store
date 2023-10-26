package delivery;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy DHLDeliveryStrategy;
    List<Item> items;
    @BeforeEach
    public void init() {
        DHLDeliveryStrategy = new DHLDeliveryStrategy();
    }
    @Test
    public void testDHLDelivery() {
        Assertions.assertEquals(DHLDeliveryStrategy.deliver(items), "Thank you for using DHL Delivery!");
    }
}