package payment;

import com.example.demo.payment.CreditCartPaymentStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class CreditCardPaymentStrategyTest {
    private CreditCartPaymentStrategy creditCardPaymentStrategy;
    private double price;
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    @BeforeEach
    public void init() {
        creditCardPaymentStrategy = new CreditCartPaymentStrategy();
        price = RANDOM_GENERATOR.nextDouble(MAX_PRICE);
    }
    @Test
    public void testCreditCardPayment() {
        Assertions.assertEquals(creditCardPaymentStrategy.pay(price), "Payed " + price + " dollars using credit card");
    }
}

