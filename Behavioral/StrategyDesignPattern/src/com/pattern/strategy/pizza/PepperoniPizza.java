package com.pattern.strategy.pizza;

import com.pattern.strategy.payment.PaymentMethod;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza(PaymentMethod currentPaymentMethod) {
        super(currentPaymentMethod);
    }


    public void preparePizza(){
        System.out.println("Preparing Pepperoni Pizza.");
    }
}
