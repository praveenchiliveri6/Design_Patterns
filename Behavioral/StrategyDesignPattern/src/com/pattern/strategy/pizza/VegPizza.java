package com.pattern.strategy.pizza;

import com.pattern.strategy.payment.PaymentMethod;

public class VegPizza extends Pizza{
    public VegPizza(PaymentMethod currentPaymentMethod) {
        super(currentPaymentMethod);
    }

    public void preparePizza(){
        System.out.println("Preparing Veg Pizza.");
    }
}
