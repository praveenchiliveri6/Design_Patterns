package com.pattern.observer.observer;

import com.pattern.observer.observable.StockObserverable;

public class PushAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObserverable stockObserverable;

    public PushAlertObserverImpl(String userName, StockObserverable stockObserverable) {
        this.userName = userName;
        this.stockObserverable = stockObserverable;
    }

    @Override
    public void update() {
        sendPushMessage();
    }

    public void sendPushMessage(){
        System.out.println("Push message sent to : "+userName+ ". Current Stock count is : "+stockObserverable.getStockCount());
    }
}
