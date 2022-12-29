package com.pattern.strategy.payment;

import com.pattern.strategy.payment.PaymentMethod;

public class CreditCardPaymentMethodImpl implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment is completed using Credit Card.");
    }
}
