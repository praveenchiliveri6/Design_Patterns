package com.pattern.observer.observable;

import com.pattern.observer.observer.NotificationAlertObserver;

public interface StockObserverable {
    public void subscribe(NotificationAlertObserver notificationObserver);
    public void unsubscribe(NotificationAlertObserver notificationObserver);
    public void notifySubscribers();
    public void setStockCount(int count);
    public int getStockCount();
}
