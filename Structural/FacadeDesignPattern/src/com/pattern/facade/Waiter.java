package com.pattern.facade;

public class Waiter {
    public void takeOrder(){
        System.out.println("Take Order from Client.");
    }
    public void sendOrderToCook(){
        System.out.println("Send Order to Cook.");
    }
    public void serveCustomer(){
        System.out.println("Serve Food to Customer.");
    }
}
