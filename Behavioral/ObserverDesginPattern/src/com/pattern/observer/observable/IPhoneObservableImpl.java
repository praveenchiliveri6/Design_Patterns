package com.pattern.observer.observable;

import com.pattern.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObserverable{
    List<NotificationAlertObserver> observerList=new ArrayList<>();
    public int stockCount=0;

    @Override
    public void subscribe(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:observerList)
            observer.update();
    }

    @Override
    public void setStockCount(int newStockCount) {
        stockCount+=newStockCount;
        if(stockCount==newStockCount){
            notifySubscribers();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
