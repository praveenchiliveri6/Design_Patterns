package com.pattern.strategy.pizza;

import com.pattern.strategy.payment.PaymentMethod;

public class CheesePizza extends Pizza{
    public CheesePizza(PaymentMethod currentPaymentMethod) {
        super(currentPaymentMethod);
    }

    public void preparePizza(){
        System.out.println("Preparing Cheese Pizza.");
    }
}
