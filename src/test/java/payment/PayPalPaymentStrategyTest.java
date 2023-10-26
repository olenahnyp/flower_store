package payment;

import com.example.demo.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class PayPalPaymentStrategyTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private PayPalPaymentStrategy payPalPaymentStrategy;
    private double price;
    @BeforeEach
    public void init() {
        payPalPaymentStrategy = new PayPalPaymentStrategy();
        price = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
    }
    @Test
    public void testPalPalPayment() {
        Assertions.assertEquals(payPalPaymentStrategy.pay(price),
                "Payed " + price + " dollars using pay pal");
    }
}
