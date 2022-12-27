package com.pattern.observer.observer;

import com.pattern.observer.observable.StockObserverable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObserverable stockObserverable;


    public MobileAlertObserverImpl(String userName, StockObserverable stockObserverable) {
        this.userName = userName;
        this.stockObserverable = stockObserverable;
    }

    @Override
    public void update() {
        sendMessage();
    }
    public void sendMessage(){
        System.out.println("Message sent to : "+userName+ ". Current Stock count is : "+stockObserverable.getStockCount());
    }
}
