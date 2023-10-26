package delivery;

import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.flowers.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class PostDeliveryStrategyTest {
    private PostDeliveryStrategy postDeliveryStrategy;
    List<Item> items;
    @BeforeEach
    public void init() {
        postDeliveryStrategy = new PostDeliveryStrategy();
    }
    @Test
    public void testPostDelivery() {
        Assertions.assertEquals(postDeliveryStrategy.deliver(items), "Thank you for using Post Delivery!");
    }
}
