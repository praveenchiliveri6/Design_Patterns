package com.pattern.strategy.pizza;

import com.pattern.strategy.payment.PaymentMethod;

public class Pizza {
    PaymentMethod paymentMethod;

    Pizza(PaymentMethod currentPaymentMethod){
        paymentMethod=currentPaymentMethod;
    }

    public void preparePizza(){
        System.out.println("Preparing Pizza.");
    }

    public void pay(){
        paymentMethod.pay();
    }

}
