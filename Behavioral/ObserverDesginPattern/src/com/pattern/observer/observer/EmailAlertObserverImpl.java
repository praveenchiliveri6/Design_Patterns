package com.pattern.observer.observer;

import com.pattern.observer.observable.StockObserverable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObserverable stockObserverable;

    public EmailAlertObserverImpl(String emailId, StockObserverable stockObserverable) {
        this.emailId = emailId;
        this.stockObserverable = stockObserverable;
    }

    @Override
    public void update() {
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("Email is sent to : "+emailId + ". Current Stock count is : "+stockObserverable.getStockCount());
    }

}
