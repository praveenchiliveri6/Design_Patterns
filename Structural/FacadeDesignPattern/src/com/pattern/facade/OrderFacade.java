package com.pattern.facade;

public class OrderFacade {

    //Better to use auto wired
    private Waiter waiter=new Waiter();
    private Kitchen kitchen=new Kitchen();

    public void orderFood(){
        waiter.takeOrder();
        waiter.sendOrderToCook();
        kitchen.cookFood();
        kitchen.signalReady();
        waiter.serveCustomer();
    }
}
