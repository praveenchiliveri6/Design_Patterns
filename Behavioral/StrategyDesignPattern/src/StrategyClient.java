import com.pattern.strategy.payment.CreditCardPaymentMethodImpl;
import com.pattern.strategy.payment.GooglePayPaymentMethodImpl;
import com.pattern.strategy.payment.PayPalPaymentMethodImpl;
import com.pattern.strategy.payment.PaymentMethod;
import com.pattern.strategy.pizza.CheesePizza;
import com.pattern.strategy.pizza.PepperoniPizza;
import com.pattern.strategy.pizza.Pizza;
import com.pattern.strategy.pizza.VegPizza;

public class StrategyClient {
    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPaymentMethodImpl();
        PaymentMethod paypalPayment = new PayPalPaymentMethodImpl();
        PaymentMethod googlePayPayment = new GooglePayPaymentMethodImpl();

        Pizza vegPizza = new VegPizza(creditCardPayment);
        vegPizza.preparePizza();
        vegPizza.pay();

        Pizza cheesePizza = new CheesePizza(paypalPayment);
        cheesePizza.preparePizza();
        cheesePizza.pay();

        Pizza pepperoniPizza = new PepperoniPizza(googlePayPayment);
        pepperoniPizza.preparePizza();
        pepperoniPizza.pay();
    }
}
