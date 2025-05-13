package behavioral.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class StrategyPatternTest {

    @Test
    @DisplayName("Should correctly call payment strategy method")
    public void shouldCorrectlyPayWithDifferentPaymentStrategies() {
        ShoppingCart shoppingCart = new ShoppingCart();
        CreditCardPayment realPayment = new CreditCardPayment("1234567890");
        CreditCardPayment spyPayment = spy(realPayment);

        shoppingCart.setPaymentStrategy(spyPayment);
        shoppingCart.checkout(100);

        verify(spyPayment, times(1)).pay(100);
    }
}
